package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javabeans.NguoiDung;

public class NguoiDungBL {
    public static NguoiDung docTheoEmailPassword(String email, String password) {
        NguoiDung nd = null;
        String sql = "select * from nguoidung where email='" + email + "' and password='" + password + "'";
        try(Connection kn = Database.getConnect()) {
            Statement stm = kn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if(rs.next()) {
                nd = new NguoiDung();
                nd.setId(rs.getInt("id"));
                nd.setEmail(rs.getString("email"));
                nd.setPassword(rs.getString("password"));
                nd.setHoTen(rs.getString("hoten"));
                nd.setDiaChi(rs.getString("diachi"));
                nd.setDtdd(rs.getString("dtdd"));
                nd.setIdVaiTro(rs.getInt("id_vaitro"));
            }
        } catch (Exception e) {
            return null;
        }
        return nd;
    }
    
    public static void main(String[] args) {
        NguoiDung nd = docTheoEmailPassword("bichle@gmail.com", "bichle");
        System.out.println(nd.getHoTen());
    }
        
}

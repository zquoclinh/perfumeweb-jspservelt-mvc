package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TrangThaiDonHangBL {
    public static List<TrangThaiDonHang> docTatCa(){
        List<TrangThaiDonHang> dsttd = new ArrayList<>();
        try(Connection conn = Database.getConnect()) {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("select * from TrangThaiDonHang");
            
            while(rs.next()) {
                TrangThaiDonHang ttd = new TrangThaiDonHang();
                ttd.setTenTrangThai("tentrangthai");
                
                dsttd.add(ttd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsttd;
    }
}

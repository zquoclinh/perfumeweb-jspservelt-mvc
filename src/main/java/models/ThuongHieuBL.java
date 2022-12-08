package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ThuongHieuBL {
    public static List<ThuongHieu> docTatCa(){
        List<ThuongHieu> dsth = new ArrayList<>();
        try(Connection conn = Database.getConnect()) {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("select * from thuonghieu");
            
            while(rs.next()) {
                ThuongHieu th = new ThuongHieu();
                th.setHinhAnh(rs.getString("hinhanh"));
                th.setTenThuongHieu("tenthuonghieu");
                
                dsth.add(th);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsth;
    }
}

package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LoaiBL {
    public static List<Loai> docTatCa(){
        List<Loai> dsloai = new ArrayList<>();
        try(Connection conn = Database.getConnect()) {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("select * from loai");
            
            while(rs.next()) {
                Loai loai = new Loai();
                loai.setTenLoai("tenloai");
                
                dsloai.add(loai);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsloai;
    }
}

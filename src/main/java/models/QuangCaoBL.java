package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class QuangCaoBL {
    public static List<QuangCao> docTatCa(){
        List<QuangCao> dsqc = new ArrayList<>();
        try(Connection conn = Database.getConnect()) {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("select * from quangcao");
            
            while(rs.next()) {
                QuangCao qc = new QuangCao();
                qc.setHinhAnh(rs.getString("hinhanh"));
                qc.setThongDiep(rs.getString("thongdiep"));
                
                dsqc.add(qc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsqc;
    }
}

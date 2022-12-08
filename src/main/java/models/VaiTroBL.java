package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VaiTroBL {
    public static List<VaiTro> docTatCa(){
        List<VaiTro> dsvt = new ArrayList<>();
        try(Connection conn = Database.getConnect()) {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("select * from VaiTro");
            
            while(rs.next()) {
                VaiTro vt = new VaiTro();
                vt.setTenVaiTro("tenvaitro");
                vt.setMoTa("mota");
                
                dsvt.add(vt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsvt;
    }
}

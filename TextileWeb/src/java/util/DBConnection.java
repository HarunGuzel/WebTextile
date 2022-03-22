package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public abstract class DBConnection {

    public Connection connect() {
        Connection c = null;
        
        try {
            Class.forName("org.postgresql.Driver"); // lib kullanildi

            //baglanti
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tms", "postgres", "134711");
            Statement st = c.createStatement(); //baglanti degiskeni uzerinden ulasilir
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return c;
    }

}

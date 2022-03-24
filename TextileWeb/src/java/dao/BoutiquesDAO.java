/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Boutiques;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;
import java.sql.ResultSet;
/**
 *
 * @author yalci
 */
public class BoutiquesDAO extends DBConnection{

    public void delete(Boutiques b) throws SQLException {
        try {
            java.sql.Statement st = this.connect().createStatement();
            String query2 = "delete from boutiques where bot_id='"+b.getBout_id()+"'";
            int r = st.executeUpdate(query2);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void createBoutiques(Boutiques b) {
        try {
            
            java.sql.Statement st =this.connect().createStatement();
            
            System.out.println("-------test");
            String query = "insert into Boutiques (boutiqie_name) values ('"+ b.getBout_name()+"')";
            
            System.out.println(query);
            int r = st.executeUpdate(query);
            
            System.out.println("------test");
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<Boutiques> getBoutiquesList() {
        List<Boutiques> boutiquesList = new ArrayList<>();
        
        try {
            Statement st = this.connect().createStatement();
            
            String query2 = "select * from boutiques";
            ResultSet rs = st.executeQuery(query2);
            
            while (rs.next()) {
                boutiquesList.add(new Boutiques(rs.getLong("bout_id"),rs.getString("boutique_name")));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return boutiquesList;
    }
    
}

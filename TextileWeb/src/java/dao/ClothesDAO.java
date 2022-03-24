/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Clothes;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;
import java.sql.ResultSet;

/**
 *
 * @author yalci
 */
public class ClothesDAO extends DBConnection {
    
    public void createClothes (Clothes c) {
        
        try {
            Statement st = this.connect().createStatement();
            
            System.out.println("-------test");
            String query = "insert into clothes (names) values ('"+ c.getNames() + "')";
            
            System.out.println(query);
            int r = st.executeUpdate(query);
            
            System.out.println("-------test");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void delete(Clothes c){
        
        try {
            Statement st = this.connect().createStatement();
            String query2 = "delete from clothes where id='"+c.getId()+"'";
            int r = st.executeUpdate(query2);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public List<Clothes> getClothesList() {
        
        List<Clothes> cityList = new ArrayList<>();
        
        try {

            Statement st = this.connect().createStatement();

            String query2 = "select * from city";
            ResultSet rs = st.executeQuery(query2);

            
            while (rs.next()) {
                cityList.add(new Clothes(rs.getLong("id"),rs.getString("names")));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return cityList;
    }
}
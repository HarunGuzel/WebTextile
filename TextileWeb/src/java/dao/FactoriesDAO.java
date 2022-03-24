/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Factories;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;
import java.sql.ResultSet;

/**
 *
 * @author yalci
 */
public class FactoriesDAO extends DBConnection{

    public List<Factories> getFactoriesList() {
        
        List<Factories> factoriesList = new ArrayList<>();
        
        try {
            
            Statement st = (Statement) this.connect().createStatement();
            
            String query2 = "select * from factories";
            ResultSet rs = st.executeQuery(query2);
            
            while (rs.next()) {
                factoriesList.add(new Factories(rs.getLong("factory_id"),rs.getString("Factory_name")));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return factoriesList;
    }

    public void delete(Factories f) {
        
        try {
            Statement st = (Statement) this.connect().createStatement();
            String query2 = "delete from factories where city_id='"+f.getFactory_Id()+"'";
            int r = st.executeUpdate(query2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void createFactories(Factories f) {
        
        try {

            Statement st = this.connect().createStatement();
            
            System.out.println("-------test");
            String query = "insert into factory (names) values ('"+ f.getNames()+ "')";
            
            System.out.println(query);
            int r = st.executeUpdate(query);
            
            System.out.println("-------test");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}

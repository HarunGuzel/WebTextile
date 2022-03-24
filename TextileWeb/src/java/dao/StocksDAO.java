/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Stocks;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;
import java.sql.ResultSet;

/**
 *
 * @author yalci
 */
public class StocksDAO extends DBConnection {

    
    
    
    public void createStocks(Stocks s) {
        try {

            Statement st = this.connect().createStatement();
            
            System.out.println("-------test");
            String query = "insert into stock (names) values ('"+ s.getStock()+ "')";
            
            System.out.println(query);
            int r = st.executeUpdate(query);
            
            System.out.println("-------test");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void delete(Stocks s){
        
        try {
            Statement st = this.connect().createStatement();
            String query2 = "delete from stocks where id='"+s.getStock()+"'";
            int r = st.executeUpdate(query2);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public List<Stocks> getStocksList() {
        
        List<Stocks> stocksList = new ArrayList<>();
        
        try {

            Statement st = this.connect().createStatement();

            String query2 = "select * from city";
            ResultSet rs = st.executeQuery(query2);

            
            while (rs.next()) {
                stocksList.add(new Stocks(rs.getLong("id"),rs.getString("names")));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return stocksList;
    }
    
}

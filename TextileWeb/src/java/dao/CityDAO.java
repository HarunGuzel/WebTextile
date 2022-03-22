package dao;

import entity.City;
import util.DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CityDAO extends DBConnection{

    

    public void createCity(City c) {
        try {

            Statement st = this.connect().createStatement();
            
            System.out.println("-------test");
            String query = "insert into city (names) values ('"+ c.getNames() + "')";
            
            System.out.println(query);
            int r = st.executeUpdate(query);
            
            System.out.println("-------test");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void delete(City c){
        
        try {
            Statement st = this.connect().createStatement();
            String query2 = "delete from city where id='"+c.getId()+"'";
            int r = st.executeUpdate(query2);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<City> getCityList() {
        
        List<City> cityList = new ArrayList<>();
        
        try {

            Statement st = this.connect().createStatement();

            String query2 = "select * from city";
            ResultSet rs = st.executeQuery(query2);

            
            while (rs.next()) {
                cityList.add(new City(rs.getLong("id"),rs.getString("names")));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return cityList;
    }
    
   
    
}

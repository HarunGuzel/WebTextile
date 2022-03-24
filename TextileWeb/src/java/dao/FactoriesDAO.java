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
    
    
    public void createFactories(Factories f) {
        
        try {

            Statement st = this.connect().createStatement();
            
            System.out.println("-------test");
            String query = "insert into factories (factory_name,city_id) values ('" + f.getFactory_name()+ "','" + f.getCity_id()+ "')";
            
            System.out.println(query);
            int r = st.executeUpdate(query);
            
            System.out.println("-------test");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void delete(Factories f) {
        
        try {
            Statement st = (Statement) this.connect().createStatement();
            String query2 = "delete from factories where factory_id='"+f.getFactory_id()+"'";
            int r = st.executeUpdate(query2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void update(Factories entity) {
        try {
            Statement st = this.connect().createStatement();
            System.out.println("update girdi");
            String query2 = "update factories set factory_name='" + entity.getFactory_name()+ "' , city_id='" + entity.getCity_id()+ "' where factory_id= " + entity.getFactory_id();
            int r = st.executeUpdate(query2);
            System.out.println("update cikti");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public List<Factories> getFactoriesList() {
        
        List<Factories> factoriesList = new ArrayList<>();
        
        try {
            
            Statement st = (Statement) this.connect().createStatement();
            
            String query2 = "select * from factories";
            ResultSet rs = st.executeQuery(query2);
            
            while (rs.next()) {
                factoriesList.add(new Factories(rs.getLong("factory_id"),rs.getString("factory_name"),rs.getLong("city_id")));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return factoriesList;
    }

    

    
}

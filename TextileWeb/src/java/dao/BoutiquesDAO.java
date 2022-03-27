/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Boutiques;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;
import java.sql.ResultSet;

/**
 *
 * @author yalci
 */
public class BoutiquesDAO extends DBConnection {

    public void createBoutiques(Boutiques b) {
        try {

            java.sql.Statement st = this.connect().createStatement();

            System.out.println("-------create girdi");
            String query = "insert into boutiques (bout_name,city_id,factor_id) values ('" + b.getBout_name() + "','" + b.getCity_id() + "','" + b.getFactor_id() + "')";

            System.out.println(query);
            int r = st.executeUpdate(query);

            System.out.println("------create cikti");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void update(Boutiques entity) {
        try {
            Statement st = this.connect().createStatement();
            System.out.println("update girdi");
            String query2 = "update boutiques set bout_name='" + entity.getBout_name() + "' , city_id='" + entity.getCity_id() + "' , factor_id='" + entity.getFactor_id() + "' where bout_id= " + entity.getBout_id() ;
            System.out.println("update cikti");
            int r = st.executeUpdate(query2);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void delete(Boutiques b) {
        try {
            java.sql.Statement st = this.connect().createStatement();
            String query2 = "delete from boutiques where bout_id='" + b.getBout_id() + "'";
            int r = st.executeUpdate(query2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<Boutiques> getBoutiquesList() {
        List<Boutiques> boutiquesList = new ArrayList<>();

        try {
            Statement st = this.connect().createStatement();

            String query2 = "select * from boutiques order by bout_id asc";
            ResultSet rs = st.executeQuery(query2);

            while (rs.next()) {
                boutiquesList.add(new Boutiques(rs.getLong("bout_id"), rs.getLong("city_id"), rs.getLong("factor_id"), rs.getString("bout_name")));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return boutiquesList;
    }
    
    public List<Boutiques> getBoutiquesMonoList(Boutiques entity) {

        List<Boutiques> boutiquesMonoList = new ArrayList<>();

        try {

            Statement st = this.connect().createStatement();

            String query2 = "select * from boutiques where bout_name='" + entity.getBout_name()+ "'";
            ResultSet rs = st.executeQuery(query2);

            while (rs.next()) {
                boutiquesMonoList.add(new Boutiques(rs.getLong("bout_id"), rs.getLong("city_id"), rs.getLong("factor_id"), rs.getString("bout_name")));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return boutiquesMonoList;
    }

}

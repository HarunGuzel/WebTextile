/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.City;
import entity.Employees;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author yalci
 */
public class EmployeesDAO extends DBConnection{
    
    public void createEmployees(Employees e) {
        try {

            Statement st = this.connect().createStatement();
            
            System.out.println("-------test");
            String query = "insert into employees (first_name,last_name,phone) values ('"+ e.getFirst_name()+ "','"+e.getLast_name()+"','"+e.getPhone()+"')";
            
            System.out.println(query);
            int r = st.executeUpdate(query);
            
            System.out.println("-------test");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void delete(Employees e){
        
        try {
            Statement st = this.connect().createStatement();
            String query2 = "delete from employees where emp_id='"+e.getEmp_id()+"'";
            int r = st.executeUpdate(query2);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public List<Employees> getEmployeesList() {
        
        List<Employees> employeesList = new ArrayList<>();
        
        try {

            Statement st = this.connect().createStatement();

            String query2 = "select * from employees";
            ResultSet rs = st.executeQuery(query2);

            
            while (rs.next()) {
                employeesList.add(new Employees(rs.getLong("emp_id"),rs.getString("first_name"),rs.getString("last_name"),rs.getString("phone")));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return employeesList;
    }
    
}

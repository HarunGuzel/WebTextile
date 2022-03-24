/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.EmployeesDAO;
import entity.Employees;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author yalci
 */
@Named(value = "employeesBean")
@SessionScoped
public class EmployeesBean implements Serializable {

    private Employees entity;
    private EmployeesDAO dao;
    private List<Employees> list;
    
    public EmployeesBean() {
    }

    public void create() {
        this.getDao().createEmployees(entity);
    }
    
    public void delete(Employees e){
        this.getDao().delete(e);
    }
    
    public Employees getEntity() {
        if (this.entity == null) {
            this.entity = new Employees();
        }
        return entity;
    }

    public void setEntity(Employees entity) {
        this.entity = entity;
    }

    public EmployeesDAO getDao() {
        if (this.dao == null) {
            this.dao = new EmployeesDAO();
        }
        return dao;
    }

    public void setDao(EmployeesDAO dao) {
        this.dao = dao;
    }

    public List<Employees> getList() {
        this.list = this.getDao().getEmployeesList();
        return list;
    }

    public void setList(List<Employees> list) {
        this.list = list;
    }
    
    
    
}
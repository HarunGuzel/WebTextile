/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.FactoriesDAO;
import entity.City;
import entity.Factories;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author yalci
 */
@Named(value = "factoriesBean")
@SessionScoped
public class FactoriesBean implements Serializable {

    private Factories entity;
    private FactoriesDAO dao;
    private List<Factories> list;
    
    
    public FactoriesBean() {
    }
    
    public void create () {
        this.getDao().createFactories(entity);
    }
    
     public void delete(Factories f){
        this.getDao().delete(f);
    }
    
    public Factories gerEntity() {
        if (this.entity == null) {
            this.entity = new Factories();
        }
        return entity;
    }
    
    public void setEntity(Factories entity) {
        this.entity = entity;
    }
    
    public FactoriesDAO getDao() {
        if (this.dao == null) {
            this.dao = new FactoriesDAO ();
        }
        return dao;
    }
    
    public void setDao(FactoriesDAO dao) {
        this.dao = dao;
    }
    
    public List<Factories> getList() {
        this.list = this.getDao().getFactoriesList();
        return list;
    }
    
    public void setList (List<Factories> list) {
        this.list = list;
    } 
}

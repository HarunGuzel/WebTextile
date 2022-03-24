/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.CityDAO;
import entity.City;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author yalci
 */
@Named(value = "cityBean")
@SessionScoped
public class CityBean implements Serializable{

    private City entity;
    private CityDAO dao;
    private List<City> list;

    public CityBean() {
    }
    
    public void create() {
        this.getDao().createCity(entity);
        this.entity = new City();
    }
    
    public void delete(City c){
        this.getDao().delete(c);
    }
    
    public void update(){
        this.getDao().update(this.entity);
        this.entity = new City();
    }
    public void updateForm(City c){
        this.entity = c;
    }
    public City getEntity() {
        if (this.entity == null) {
            this.entity = new City();
        }
        return entity;
    }

    public void setEntity(City entity) {
        this.entity = entity;
    }

    public CityDAO getDao() {
        if (this.dao == null) {
            this.dao = new CityDAO();
        }
        return dao;
    }

    public void setDao(CityDAO dao) {
        this.dao = dao;
    }

    public List<City> getList() {
        this.list = this.getDao().getCityList();
        return list;
    }

    public void setList(List<City> list) {
        this.list = list;
    }
    

}

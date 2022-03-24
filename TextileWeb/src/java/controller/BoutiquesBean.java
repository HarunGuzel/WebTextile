/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.BoutiquesDAO;
import entity.Boutiques;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author yalci
 */
@Named(value = "boutiquesBean")
@SessionScoped
public class BoutiquesBean implements Serializable {
    
    private Boutiques entity;
    private BoutiquesDAO dao;
    private List<Boutiques> list;
    /**
     * Creates a new instance of BoutiquesBean
     */
    public BoutiquesBean() {
    }
    
    public void create() {
        this.getDao().createBoutiques(entity);
    }
    
    public void delete(Boutiques b) throws SQLException{
        this.getDao().delete(b);
    }
    
    public Boutiques getEntity() {
        if (this.entity == null) {
            this.entity = new Boutiques();
        }
        return entity;
    }
    
    public void setEntity(Boutiques entity) {
        this.entity = entity;
    }
    
    public BoutiquesDAO getDao() {
        if (this.dao == null) {
            this.dao = new BoutiquesDAO();
        }
        return dao;
    }
    
    public void setDao(BoutiquesDAO dao) {
        this.dao = dao;
    }
    
    public List<Boutiques> getList() {
        this.list = this.getDao().getBoutiquesList();
        return list;
    }
    
    public void setList(List<Boutiques> list) {
        this.list = list;
    }
}
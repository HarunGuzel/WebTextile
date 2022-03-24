/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.ClothesDAO;
import entity.Clothes;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author yalci
 */
@Named(value = "clothesBean")
@SessionScoped
public class ClothesBean implements Serializable {
    
    private Clothes entity;
    private ClothesDAO dao;
    private List<Clothes> list;

    /**
     * Creates a new instance of ClothesBean
     */
    public ClothesBean() {
    }
    
    public void create(){
        this.getDao().createClothes(entity);
    }
    
    public void delete(Clothes c){
        this.getDao().delete(c);
    }
    
    public Clothes getEntity() {
        if (this.entity == null) {
            this.entity = new Clothes();
        }
        return entity;
    } 
    
    public void setEntity(Clothes entity) {
        this.entity = entity;
    }
    
    public ClothesDAO getDao() {
        if (this.dao == null) {
            this.dao = new ClothesDAO();
        }
        return dao;
    }
    
    public void setDao(ClothesDAO dao) {
        this.dao = dao;
    }
    
    public List<Clothes> getList() {
        this.list = this.getDao().getClothesList();
        return list;
    }
    
    public void setList(List<Clothes> list) {
        this.list = list;
    }
}

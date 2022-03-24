/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author yalci
 */
public class Stocks implements Serializable{
    
    private Long id;
    //private Long cloth_id;
    private String stock;
    
    public Stocks(){
        
    }
    
    public Stocks(Long id, String stock) {
        this.id = id;
        //this.cloth_id = cloth_id;
        this.stock = stock;
    }
    
    public Long getId(){
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getStock() {
        return stock;
    }
    
    public void setStock(String names) {
        this.stock = names;
    }
    
    //override yok
}




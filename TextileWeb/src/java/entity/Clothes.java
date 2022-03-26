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
public class Clothes implements Serializable{
    
    private Long cloth_id;
    private String cloth_name;
    
    public Clothes() {
        
    }
  
    public Clothes(Long cloth_id,String cloth_name) {
        this.cloth_id = cloth_id;
        this.cloth_name = cloth_name;
    }
    public Clothes(String names) {
        this.cloth_name = names;
    }
    
    public Long getCloth_id(){
        return cloth_id;
    }
    
    public void setCloth_id(Long cloth_id) {
        this.cloth_id = cloth_id;
    }
    
    public String getCloth_name(){
        return cloth_name;
    }
    
    public void setCloth_name(String cloth_name) {
        this.cloth_name = cloth_name;
    }
    
    //Overright şeysi eksik
    @Override
    public String toString() {
        return "Clothes{" + "cloth_id=" + cloth_id + ", cloth_name=" + cloth_name + '}';
    }
    
}

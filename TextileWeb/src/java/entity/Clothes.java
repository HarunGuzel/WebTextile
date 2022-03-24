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
    
    public Clothes(Long id,String names) {
        this.cloth_id = id;
        this.cloth_name = names;
    }
    
    public Long getId(){
        return cloth_id;
    }
    
    public void setId(Long id) {
        this.cloth_id = id;
    }
    
    public String getNames(){
        return cloth_name;
    }
    
    public void setNames(String names) {
        this.cloth_name = names;
    }
    
    //Overright şeysi eksik
    
}

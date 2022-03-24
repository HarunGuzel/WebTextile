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
public class Factories implements Serializable{
    
    private Long factory_id;
    //private Long city_id;
    private String factory_name;
    
    public Factories() {
        
    }
    
    public Factories(String names) {
        this.factory_id = factory_id;
        //this.city_id = city_id;
        this.factory_name = factory_name;
    }
    
    public Factories(Long factory_id, String factory_name){
        this.factory_id = factory_id;
        this.factory_name = factory_name;
    }
    
    public Long getFactory_Id() {
        return factory_id;
    }
    
    public void setId (Long factory_id) {
        this.factory_id = factory_id;
    }
    
    public String getNames(){
        return factory_name;
    }
    
    public void setNames (String names){
        this.factory_name = factory_name;
    }
    
   //Override şeysi eksik 
}

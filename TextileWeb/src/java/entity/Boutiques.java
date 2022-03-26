/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;


public class Boutiques implements Serializable{
    
    private Long bout_id;
    private Long city_id;
    private Long factor_id;
    private String bout_name;
    
    public Boutiques(){
        
    }
    
    public Boutiques(Long bout_id,Long city_id,Long factor_id, String bout_name){
        this.bout_id = bout_id;
        this.city_id = city_id;
        this.factor_id = factor_id;
        this.bout_name = bout_name;        
    }
    
    public Boutiques(String bout_name){
        this.bout_name = bout_name;
    }
    
    public Long getBout_id() {
        return bout_id;
    }
    
    public void setBout_id(Long bout_id) {
        this.bout_id = bout_id;
    }
    
    public Long getCity_id() {
        return city_id;
    }

    public void setCity_id(Long city_id) {
        this.city_id = city_id;
    }

    public Long getFactor_id() {
        return factor_id;
    }

    public void setFactor_id(Long factor_id) {
        this.factor_id = factor_id;
    }

    public String getBout_name() {
        return bout_name;
    }
    
    public void setBout_name(String bout_name) {
        this.bout_name = bout_name;
    }
    
    @Override
    public String toString() {
        return "Boutiques{" + "bout_id=" + bout_id + ", bout_name=" + bout_name +"city_id" +city_id+ "factor_id" +factor_id +  '}';
    }
}

package entity;

import java.io.Serializable;

/**
 *
 * @author yalci
 */
public class Factories implements Serializable{
    
    private Long factory_id;
    private Long city_id;
    private String factory_name;
    
    public Factories() {
        
    }
  
    public Factories(Long city_id, String factory_name,Long factory_id){
        this.city_id = city_id;
        this.factory_name = factory_name;
        this.factory_id = factory_id;
    }

    public Long getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(Long factory_id) {
        this.factory_id = factory_id;
    }

    public Long getCity_id() {
        return city_id;
    }

    public void setCity_id(Long city_id) {
        this.city_id = city_id;
    }

    public String getFactory_name() {
        return factory_name;
    }

    public void setFactory_name(String factory_name) {
        this.factory_name = factory_name;
    }
    
    
     
}

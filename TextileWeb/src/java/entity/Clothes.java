package entity;

import java.io.Serializable;

/**
 *
 * @author yalci
 */
public class Clothes implements Serializable{
    
    private Long cloth_id;
    private String cloth_names;
    
    public Clothes(){
        
    }
    

    public Clothes(String cloth_names) {
        this.cloth_id = cloth_id;
        this.cloth_names = cloth_names;
    }

    public Clothes(Long cloth_id, String cloth_names) {
        this.cloth_id = cloth_id;
        this.cloth_names = cloth_names;
    }

    public Long getCloth_id() {
        return cloth_id;
    }

    public void setCloth_id(Long cloth_id) {
        this.cloth_id = cloth_id;
    }

    public String getCloth_names() {
        return cloth_names;
    }

    public void setCloth_names(String cloth_names) {
        this.cloth_names = cloth_names;
    }

    @Override
    public String toString() {
        return "Clothes{" + "cloth_id=" + cloth_id + ", cloth_names=" + cloth_names + '}';
    }
    
    
}

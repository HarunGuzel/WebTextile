package entity;

import java.io.Serializable;

public class City  implements Serializable{

    private Long id;
    private String names;

    public City() {
    }

    public City(String names) {
        this.id = id;
        this.names = names;
    }

    public City(Long id, String names) {
        this.id = id;
        this.names = names;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "City{" + "id=" + id + ", names=" + names + '}';
    }
    
    

}

package br.com.cloud.pet.fish.tank.to;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tank {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fishName;
    private String ownerName;
    private Long liters;

    public String getFishName() {
        return fishName;
    }

    public void setFishName(String fishName) {
        this.fishName = fishName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Long getLiters() {
        return liters;
    }

    public void setLiters(Long liters) {
        this.liters = liters;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

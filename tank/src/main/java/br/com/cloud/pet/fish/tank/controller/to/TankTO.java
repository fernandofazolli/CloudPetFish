package br.com.cloud.pet.fish.tank.controller.to;

public class TankTO {
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
}

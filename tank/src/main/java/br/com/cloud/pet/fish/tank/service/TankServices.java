package br.com.cloud.pet.fish.tank.service;

import br.com.cloud.pet.fish.tank.to.Tank;

import java.util.List;

public interface TankServices {
    void createTank(String fishName, String ownerName, Long liters);

    List<Tank> findAllTank();
}

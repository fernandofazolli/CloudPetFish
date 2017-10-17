package br.com.cloud.pet.fish.tank.service.impl;

import br.com.cloud.pet.fish.tank.TankRepository;
import br.com.cloud.pet.fish.tank.service.TankServices;
import br.com.cloud.pet.fish.tank.to.Tank;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TankServicesImpl implements TankServices {
    private TankRepository tankRepository;

    public TankServicesImpl(TankRepository tankRepository) {
        this.tankRepository = tankRepository;
    }

    @Override
    public void createTank(String fishName, String ownerName, Long liters) {
        Tank tank = new Tank();
        tank.setFishName(fishName);
        tank.setLiters(liters);
        tank.setOwnerName(ownerName);
        tankRepository.save(tank);
    }

    @Override
    public List<Tank> findAllTank() {
        return (List<Tank>) tankRepository.findAll();
    }
}

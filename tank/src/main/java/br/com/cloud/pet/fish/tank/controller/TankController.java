package br.com.cloud.pet.fish.tank.controller;

import br.com.cloud.pet.fish.tank.controller.to.TankTO;
import br.com.cloud.pet.fish.tank.service.TankServices;
import br.com.cloud.pet.fish.tank.to.Tank;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TankController {

    private TankServices tankServices;

    public TankController(TankServices tankServices) {
        this.tankServices = tankServices;
    }

    @PostMapping(value = "tank")
    public String createTank(@RequestBody TankTO tank) {
        tankServices.createTank(tank.getFishName(), tank.getOwnerName(), tank.getLiters());
        return "Success";
    }

    @GetMapping(value = "tank")
    public List<Tank> findAllTank() {
        return tankServices.findAllTank();
    }
}

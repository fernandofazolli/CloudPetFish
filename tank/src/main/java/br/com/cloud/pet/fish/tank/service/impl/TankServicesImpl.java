package br.com.cloud.pet.fish.tank.service.impl;

import br.com.cloud.pet.fish.tank.repository.TankRepository;
import br.com.cloud.pet.fish.tank.service.TankServices;
import br.com.cloud.pet.fish.tank.to.Tank;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@Service
public class TankServicesImpl implements TankServices {
    private TankRepository tankRepository;

    private RestTemplate restTemplate;

    public TankServicesImpl(TankRepository tankRepository, RestTemplate restTemplate) {
        this.tankRepository = tankRepository;
        this.restTemplate = restTemplate;
    }

    @Override
    public void createTank(String fishName, String ownerName, Long liters) {
        String fish = this.restTemplate.getForObject("http://FISH/fish", String.class);
        System.out.println(String.format("%s !", fish));

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

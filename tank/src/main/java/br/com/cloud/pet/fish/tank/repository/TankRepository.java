package br.com.cloud.pet.fish.tank.repository;

import br.com.cloud.pet.fish.tank.to.Tank;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TankRepository  extends CrudRepository<Tank, Long> {
}

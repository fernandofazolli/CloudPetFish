package br.com.cloud.pet.fish.fish.repository;

import br.com.cloud.pet.fish.fish.model.Fish;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FishRepository extends CrudRepository<Fish, Long> {
}

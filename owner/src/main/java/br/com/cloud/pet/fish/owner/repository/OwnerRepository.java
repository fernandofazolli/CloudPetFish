package br.com.cloud.pet.fish.owner.repository;

import br.com.cloud.pet.fish.owner.model.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OwnerRepository extends CrudRepository<Owner, Long>{
}

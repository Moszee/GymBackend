package org.szpax.brothers.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.szpax.brothers.model.Client;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {

    List<Client> findAll();

}

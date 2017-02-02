package org.szpax.brothers.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.szpax.brothers.model.Coach;

import java.util.List;

@Repository
public interface CoachRepository extends CrudRepository<Coach, Long> {

    List<Coach> findAll();
}


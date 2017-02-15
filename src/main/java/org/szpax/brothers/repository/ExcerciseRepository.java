package org.szpax.brothers.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.szpax.brothers.model.Excercise;

import java.util.List;

/**
 * Created by Marcin on 15.02.2017.
 */
@Repository
public interface ExcerciseRepository extends CrudRepository<Excercise,Long> {

    List<Excercise> findAll();
}

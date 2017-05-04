package org.szpax.brothers.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.szpax.brothers.model.TrainingExcercise;

import java.util.List;

/**
 * Created by Marcin on 12.04.2017.
 */
@Repository
public interface TrainingExcerciseRepository extends CrudRepository<TrainingExcercise, Integer> {
    List<TrainingExcercise> findAll();
}

package org.szpax.brothers.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.szpax.brothers.model.Training;

import java.util.List;

/**
 * Created by Marcin on 15.02.2017.
 */
@Repository
public interface TrainingRepository extends CrudRepository<Training,Long> {

    List<Training> findAll();
}

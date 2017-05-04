package org.szpax.brothers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.szpax.brothers.model.Training;
import org.szpax.brothers.model.TrainingExcercise;
import org.szpax.brothers.repository.TrainingExcerciseRepository;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Marcin on 09.04.2017.
 */
@Service
public class TrainingExcerciseService {
    private TrainingExcerciseRepository trainingExcerciseRepository;

    @Autowired
    public TrainingExcerciseService(TrainingExcerciseRepository trainingExcerciseRepository) {
        this.trainingExcerciseRepository = trainingExcerciseRepository;
    }

    public TrainingExcercise createTrainingExcercise(Integer trainingId, Integer excerciseId, Integer numberOfReapeats) {
        TrainingExcercise trainingExcercise = new TrainingExcercise();
        trainingExcercise.setTrainingId(trainingId);
        trainingExcercise.setExcerciseId(excerciseId);
        trainingExcercise.setNumberOfRepeats(numberOfReapeats);
        return trainingExcerciseRepository.save(trainingExcercise);
    }

    public TrainingExcercise findById(Integer id) {
        return trainingExcerciseRepository.findOne(id);
    }

    public List<TrainingExcercise> findAll() {
        return trainingExcerciseRepository.findAll();
    }

    public TrainingExcercise update(Integer trainingExcerciseId, Integer excerciseId, Integer numberOfRepeats) {
        TrainingExcercise trainingExcercise = trainingExcerciseRepository.findOne(trainingExcerciseId);

        if (excerciseId != null) {
            trainingExcercise.setExcerciseId(excerciseId);
        }
        if (numberOfRepeats != null) {
            trainingExcercise.setNumberOfRepeats(numberOfRepeats);

        }
            return trainingExcerciseRepository.save(trainingExcercise);
        }

}
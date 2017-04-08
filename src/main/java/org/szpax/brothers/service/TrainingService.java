package org.szpax.brothers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.szpax.brothers.model.Training;
import org.szpax.brothers.repository.TrainingRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by Marcin on 15.02.2017.
 */
@Service
public class TrainingService {
    private TrainingRepository trainingRepository;

    @Autowired
    public TrainingService(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }


    public Training createTraining(Integer clientId, Date birthDate, String timeOfTheDayCode) {
        Training training = new Training();
        training.setClientId(clientId);
        training.setBirthDate(birthDate);
        training.setTimeOfTheDayCode(timeOfTheDayCode);
        return trainingRepository.save(training);
    }
    public List<Training> findAll() {return trainingRepository.findAll();}

    public Training findTrainingById(Long id) {return trainingRepository.findOne(id);}

}
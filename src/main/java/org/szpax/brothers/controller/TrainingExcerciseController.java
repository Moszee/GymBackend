package org.szpax.brothers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.szpax.brothers.model.TrainingExcercise;
import org.szpax.brothers.service.TrainingExcerciseService;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * Created by Marcin on 13.04.2017.
 */
@RestController
@RequestMapping("/trainingExcercise")
public class TrainingExcerciseController {

    private final TrainingExcerciseService trainingExcerciseService;

    @Autowired
    public TrainingExcerciseController(TrainingExcerciseService trainingExcerciseService) {
        this.trainingExcerciseService = trainingExcerciseService;
    }

    @RequestMapping("/add")
    public TrainingExcercise add(@RequestParam Integer trainingId,
                                 @RequestParam Integer excerciseId,
                                 @RequestParam Integer numberOfRepeats) {
        return trainingExcerciseService.createTrainingExcercise(trainingId, excerciseId,numberOfRepeats);
    }

    @RequestMapping("/list")
    public List<TrainingExcercise> list() { return trainingExcerciseService.findAll();}

    @RequestMapping("/{trainingExcerciseId}")
    public TrainingExcercise one (@PathVariable Integer trainingExcerciseId) { return trainingExcerciseService.findById(trainingExcerciseId); }

    @RequestMapping("/{trainingExcerciseId}/update")
    public TrainingExcercise update (@PathVariable Integer trainingExcerciseId,
                                     @RequestParam(required = false ) Integer excerciseId,
                                     @RequestParam(required = false ) Integer numberOfRepeat) {
        return trainingExcerciseService.update(trainingExcerciseId, excerciseId, numberOfRepeat) ;
    }
}

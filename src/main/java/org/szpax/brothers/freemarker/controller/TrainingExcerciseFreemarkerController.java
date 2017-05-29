package org.szpax.brothers.freemarker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.szpax.brothers.model.TrainingExcercise;
import org.szpax.brothers.service.TrainingExcerciseService;

import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by Marcin on 28.05.2017.
 */

@Controller
@RequestMapping("/freemarker/trainingExcercise")
public class TrainingExcerciseFreemarkerController {

    private TrainingExcerciseService trainingExcerciseService;

    @Autowired
    public TrainingExcerciseFreemarkerController (TrainingExcerciseService trainingExcerciseService) {
        this.trainingExcerciseService = trainingExcerciseService; }

    @RequestMapping("/add")

    public String addTrainingExcercise(Map<String, Object> model) { return "addTrainingExcercise";}

    @RequestMapping(value = "/save", method = POST)
    public String saceClient(
            @RequestParam Integer trainingId,
            @RequestParam Integer excerciseId,
            @RequestParam Integer numberOfRepeats, Map<String, Object> model) {
        TrainingExcercise trainingExcercise = trainingExcerciseService.createTrainingExcercise(trainingId, excerciseId, numberOfRepeats);

        model.put("trainingExcercise", trainingExcercise);

        return "showTrainingExcercise" ;
    }
}

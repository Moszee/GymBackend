package org.szpax.brothers.freemarker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.szpax.brothers.model.Training;
import org.szpax.brothers.service.TrainingService;

import java.util.Date;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by Marcin on 27.05.2017.
 */

@Controller
@RequestMapping("freemarker/Training")
public class TrainingFreemarkerController {

    private TrainingService trainingService;

    @Autowired
    public TrainingFreemarkerController (TrainingService trainingService) {this.trainingService = trainingService; }

    @RequestMapping("/add")
    public String addTraining(Map<String, Object> model) {return "addTraining"; }

    @RequestMapping(value = "save", method = POST)
    public String saveTraining (
            @RequestParam Integer clientId,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd")Date birthDate,
            @RequestParam String timeOfTheDayCode,
            Map<String, Object>model
            ) {
        Training training = trainingService.createTraining(clientId, birthDate, timeOfTheDayCode);
        model.put("training", training);
        return "showTraining";
    }
}

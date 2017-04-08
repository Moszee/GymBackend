package org.szpax.brothers.controller;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.format.annotation.DateTimeFormat;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.RestController;
        import org.szpax.brothers.model.Training;
        import org.szpax.brothers.service.TrainingService;

        import java.util.Date;
        import java.util.List;

/**
 * Created by Marcin on 15.02.2017.
 */
@RestController
@RequestMapping("admin/training")
public class TrainingController {
    private final TrainingService trainingService;

    @Autowired
    public TrainingController(TrainingService trainingService) {this.trainingService = trainingService;}

    @RequestMapping("/list")
    public List<Training> list() {return trainingService.findAll();}
    @RequestMapping("/add")
    public Training add (@RequestParam Integer clientId,
                         @RequestParam @DateTimeFormat(pattern="MMddyyyy") Date birthDate,
                         @RequestParam String timeOfTheDayCode) {
        Training training = trainingService.createTraining(clientId, birthDate, timeOfTheDayCode);
        return training;
    }

    @RequestMapping("{trainingId}")
    public Training one(@PathVariable Long trainingId) {
        return trainingService.findTrainingById(trainingId);
    }
}

package org.szpax.brothers.freemarker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.szpax.brothers.model.Coach;
import org.szpax.brothers.service.CoachService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.POST;


/**
 * Created by Marcin on 14.05.2017.
 */

@Controller
@RequestMapping("freemarker/coach")
public class CoachFreemarkerController {

    private CoachService coachService;

    @Autowired
    public CoachFreemarkerController(CoachService coachService) {
        this.coachService = coachService;
    }

    @RequestMapping("/add")
    public String addCoach(Map<String, Object> model) {
        List<String> animals = new ArrayList<>();

        animals.add("kot");
        animals.add("pies");

        model.put("animals", animals);
        return "addCoach";
    }

    @RequestMapping(value = "/save", method = POST)
    public String saveCoach(
            @RequestParam String firstName,
            @RequestParam String lastName,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date birthDate,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date employmentDate,
            @RequestParam String position,
            Map<String, Object> model) {
        Coach coach = coachService.createCoach(firstName, lastName, birthDate, employmentDate, position);

        model.put("coach", coach);

        return "showCoach";
    }


}

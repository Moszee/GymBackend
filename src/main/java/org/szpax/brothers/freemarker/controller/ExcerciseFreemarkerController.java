package org.szpax.brothers.freemarker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.szpax.brothers.service.ExcerciseService;

import java.util.Map;

/**
 * Created by Marcin on 23.05.2017.
 */
@Controller
@RequestMapping("/freemarker/Excercise")

public class ExcerciseFreemarkerController {


    private ExcerciseService excerciseService;

    @Autowired
    public ExcerciseFreemarkerController (ExcerciseService excerciseService) { this.excerciseService = excerciseService; }

    @RequestMapping("/add")
    public String  addExcercise(Map<String, Object> model) {return "addExcercise";}

}
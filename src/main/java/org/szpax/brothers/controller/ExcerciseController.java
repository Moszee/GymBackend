package org.szpax.brothers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.szpax.brothers.model.Excercise;
import org.szpax.brothers.service.ExcerciseService;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Marcin on 16.02.2017.
 */
@RestController
@RequestMapping("/admin/excercise")
public class ExcerciseController {
    private final ExcerciseService excerciseService;

    @Autowired
    public ExcerciseController(ExcerciseService excerciseService) {this.excerciseService = excerciseService;}

    @RequestMapping("/list")
    public List<Excercise> list() {return excerciseService.findAll();}
    @RequestMapping("/add")
    public Excercise add(@RequestParam String excerciseName,
                         @RequestParam String bodyPartCode) {
        return excerciseService.createExcercise(excerciseName, bodyPartCode);
    }
    @RequestMapping("/{excerciseId}")
    public Excercise one (@PathVariable Long excerciseId) {return excerciseService.findExcerciseById(excerciseId);
    }


}

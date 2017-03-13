package org.szpax.brothers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.szpax.brothers.model.Excercise;
import org.szpax.brothers.repository.ExcerciseRepository;

import java.util.List;

/**
 * Created by Marcin on 15.02.2017.
 */
@Service
public class ExcerciseService {
    private ExcerciseRepository excerciseRepository;
    @Autowired
    public ExcerciseService (ExcerciseRepository excerciseRepository) {this.excerciseRepository = excerciseRepository;}
    public Excercise createExcercise ( String excerciseName, String bodyPartCode) {
        if(bodyPartCode=="" || bodyPartCode==null){
            throw new NullPointerException("bodyPartCode can not be NULL, or \"\" ");
        }
        Excercise excercise = new Excercise(); // co to miało być ? nawiasy () jak przy metodzie tutaj zawsze dajemy ?
        excercise.setExcerciseName(excerciseName);
        excercise.setBodyPartCode(bodyPartCode);
        return excerciseRepository.save(excercise);
    }
    public List<Excercise> findAll() {return excerciseRepository.findAll();}
    public Excercise findExcerciseById (Long id) {return  excerciseRepository.findOne(id);}
}

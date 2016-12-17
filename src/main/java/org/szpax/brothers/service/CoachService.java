package org.szpax.brothers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.szpax.brothers.model.Coach;
import org.szpax.brothers.repository.CoachRepository;

import java.util.List;

@Service
public class CoachService {

    private CoachRepository coachRepository;

    @Autowired
    public CoachService(CoachRepository coachRepository){
        this.coachRepository = coachRepository;
    }

    public Integer createCoach(String firstName, String lastName, Integer age) {
        return coachRepository.createCoach(new Coach(firstName, lastName, age));
    }

    public Coach findCoachById(Integer id) {
        return coachRepository.findById(id);
    }

    public List<Coach> findAll() {
        return coachRepository.findAll();
    }

    public Coach update(Integer coachId, String firstName, String lastName, Integer age) {
        Coach coach = coachRepository.findById(coachId);
        if(firstName != null && !firstName.isEmpty()) {
            coach.setFirstName(firstName);
        }

        if(lastName != null && !lastName.isEmpty()) {
            coach.setLastName(lastName);
        }

        if(age != null) {
            coach.setAge(age);
        }
        return coachRepository.update(coach);
    }
}

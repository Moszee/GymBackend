package org.szpax.brothers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.szpax.brothers.model.Coach;
import org.szpax.brothers.service.CoachService;

import java.util.List;

@RestController
@RequestMapping("/coach")
public class CoachController {

    private final CoachService coachService;

    @Autowired
    public CoachController(CoachService coachService) {
        this.coachService = coachService;
    }

    /**
     * Dostajemy sie tutaj pod adresem http://localhost:8080/coach/add
     *
     * @param firstName
     * @param lastName
     * @param age
     * @return nowy, dodany trener
     */
    @RequestMapping("add")
    public Coach add(@RequestParam String firstName, @RequestParam String lastName, @RequestParam Integer age) {
        Integer coachId = coachService.createCoach(firstName, lastName, age);
        return coachService.findCoachById(coachId);
    }

    /**
     * Dostajemy sie tutaj pod adresem http://localhost:8080/coach/add
     *
     * @return lista wszystkich trenerow
     */
    @RequestMapping("list")
    public List<Coach> list()  {
        return coachService.findAll();
    }

    /**
     * za coachId podajemy jakis konkretny id. 1, 2, 3... : ) Adres przykladowy:
     * <p/>
     * http://localhost:8080/coach/1
     *
     * @param coachId
     * @return coach with id
     */
    @RequestMapping("{coachId}")
    public Coach one(@PathVariable int coachId) {
        return coachService.findCoachById(coachId);
    }

    /**
     *
     * za coachId podajemy jakis konkretny id. 1, 2, 3... : ) Adres przykladowy:
     * http://localhost:8080/coach/1/update
     *
     * potem dajemy parametry: ?firstName=noweImie&lastName=noweNazwisko&age=132
     *
     * Parametry nie sa wymagane, sprobuj np. wywolac:
     *
     * http://localhost:8080/coach/1/update?age=10
     *
     * @param coachId
     * @param firstName
     * @param lastName
     * @param age
     * @return
     */

    @RequestMapping("{coachId}/update")
    public Coach update(@PathVariable int coachId,
                        @RequestParam(required = false) String firstName,
                        @RequestParam(required = false) String lastName,
                        @RequestParam(required = false) Integer age) {
        return coachService.update(coachId, firstName, lastName, age);
    }

}

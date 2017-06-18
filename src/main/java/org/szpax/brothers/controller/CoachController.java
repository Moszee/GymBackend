package org.szpax.brothers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.szpax.brothers.model.Coach;
import org.szpax.brothers.service.CoachService;

import java.sql.Date;
import java.time.Instant;
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
     * @param birthDate
     * @param employmentDate
     * @param position
     * @return nowy, dodany trener
     */
    @RequestMapping("/add")
    public Coach add(@RequestParam String firstName,
                     @RequestParam String lastName,
                     @RequestParam Integer birthDate,
                     @RequestParam Integer employmentDate,
                     @RequestParam String position) {
        return coachService.createCoach(firstName, lastName, Date.from(Instant.ofEpochMilli(birthDate)), Date.from(Instant.ofEpochMilli(employmentDate)), position);
    }

    /**
     * Dostajemy sie tutaj pod adresem http://localhost:8080/coach/add
     *
     * @return lista wszystkich trenerow
     */
    @RequestMapping("list")
    public List<Coach> list() {
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
    public Coach one(@PathVariable Long coachId) {
        return coachService.findCoachById(coachId);
    }

    /**
     * za coachId podajemy jakis konkretny id. 1, 2, 3... : ) Adres przykladowy:
     * http://localhost:8080/coach/1/update
     * <p>
     * potem dajemy parametry: ?firstName=noweImie&lastName=noweNazwisko&age=132
     * <p>
     * Parametry nie sa wymagane, sprobuj np. wywolac:
     * <p>
     * http://localhost:8080/coach/1/update?age=10
     *
     * @param coachId
     * @param firstName
     * @param lastName
     * @return
     */

    @RequestMapping("{coachId}/update")
    public Coach update(@PathVariable Long coachId,
                        @RequestParam(required = false) String firstName,
                        @RequestParam(required = false) String lastName) {
        return coachService.update(coachId, firstName, lastName);
    }

    @RequestMapping("load")
    public void load(@RequestParam String file) {


    }

}

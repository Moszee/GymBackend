package org.szpax.brothers.repository;

import org.springframework.stereotype.Repository;
import org.szpax.brothers.model.Coach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CoachRepository {

    /**
     * to usune, narazie nie mamy bazy danych wiec robie baze danych dla ubogich...
     * Implementacje tych metoda sa slabe, bo nie ma bazy, again.
     * Nie przejmuj sie tym - moge to opisac lepiej jak chcesz pozniej
     */
    private Map<Integer, Coach> dbMock = new HashMap<Integer, Coach>();

    public CoachRepository() {
        Coach coach = new Coach("Marcin", "Szpak", 27);
        dbMock.put(coach.getId(), coach);
        Coach coach1 = new Coach("Marian", "Nowak", 32);
        dbMock.put(coach1.getId(), coach1);
        Coach coach2 = new Coach("Kamil", "Drwal", 31);
        dbMock.put(coach2.getId(), coach2);
    }

    /**
     * Znajduje coacha po id
     *
     * @param id
     * @return
     */

    public Coach findById(Integer id) {
        return dbMock.get(id);
    }

    /**
     * Znajduje liste coachow o podanym imieniu i nazwisku
     *
     * @param firstName
     * @param lastName
     * @return
     */
    public List<Coach> findByFirstNameAndLastName(String firstName, String lastName) {
        List<Coach> toReturn = new ArrayList<Coach>();
        for(Coach c : dbMock.values()) {
            if(firstName.equals(c.getFirstName()) && lastName.equals(c.getLastName())) {
                toReturn.add(c);
            }
        }
        return toReturn;
    }

    public Integer insertCoach(Coach coach) {
        Coach existing = findById(coach.getId());
        if(existing != null)
            throw new IllegalArgumentException("This coach already exist!");
        dbMock.put(coach.getId(), coach);
        return coach.getId();
    }

    public List<Coach> findAll() {
        return new ArrayList<Coach>(dbMock.values());
    }

    public Coach update(Coach coach) {
        dbMock.put(coach.getId(), coach);
        return coach;
    }
}


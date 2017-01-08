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
        return coachRepository.createCoach(new Coach(firstName, lastName, age)); //metoda tworzy Coutch i zwraca jego ID
    }


    public Coach findCoachById(Integer id) {
        return coachRepository.findById(id);
    }

    public List<Coach> findAll() {
        return coachRepository.findAll();
    }

    public Coach update(Integer coachId, String firstName, String lastName, Integer age) {
        /*
        nie ma create new(!!!( dlatego to jest referencja która wskazuje, już nas interesującyobiekt, przez nią zmodyfikujemy
         obiekt który nas interesuje
         */
        /*repository normalnie tworzy kopie obiektów w bazie danych dlatego metoda modyfikuje pola obiektu , ale na koncu
        i tak podmienia te obiekty w bazie danych ( przez repository.update) w ten sposób repository zapewnia nie  bezpośrednie ingeorwanie w baze danych

         przez repository nie działamy bezpośrednio na danych w bazie danych ale na ich kopiach/rteprezentacjach*/
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

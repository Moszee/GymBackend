package org.szpax.brothers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.szpax.brothers.model.Coach;
import org.szpax.brothers.repository.CoachRepository;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@Service
public class CoachService {

    private CoachRepository coachRepository;

    private final static String DIRECTORY = "C:\\coach_data\\";

    @Autowired
    public CoachService(CoachRepository coachRepository) {
        this.coachRepository = coachRepository;
    }

    public Coach createCoach(String firstName,
                             String lastName,
                             Integer birthDate,
                             Integer employmentDate,
                             String position) {
        Coach coach = new Coach();
        coach.setFirstName(firstName);
        coach.setLastName(lastName);
        coach.setBirthDate(Date.from(Instant.ofEpochMilli(birthDate)));
        coach.setEmploymentDate(Date.from(Instant.ofEpochMilli(employmentDate)));
        coach.setPosition(position);

        return coachRepository.save(coach); //metoda tworzy coach i zwraca jego ID
    }


    public Coach findCoachById(Long id) {
        return coachRepository.findOne(id);
    }

    public List<Coach> findAll() {
        return coachRepository.findAll();
    }

    public Coach update(Long coachId, String firstName, String lastName) {
        /*
        nie ma create new(!!!( dlatego to jest referencja która wskazuje, już nas interesującyobiekt, przez nią zmodyfikujemy
        obiekt który nas interesuje

        repository normalnie tworzy kopie obiektów w bazie danych dlatego metoda modyfikuje pola obiektu , ale na koncu
        i tak podmienia te obiekty w bazie danych ( przez repository.update) w ten sposób repository zapewnia nie  bezpośrednie ingeorwanie w baze danych

        przez repository nie działamy bezpośrednio na danych w bazie danych ale na ich kopiach/rteprezentacjach*/
        Coach coach = coachRepository.findOne(coachId);
        if (firstName != null && !firstName.isEmpty()) {
            coach.setFirstName(firstName);
        }

        if (lastName != null && !lastName.isEmpty()) {
            coach.setLastName(lastName);
        }

        return coachRepository.save(coach);
    }
}

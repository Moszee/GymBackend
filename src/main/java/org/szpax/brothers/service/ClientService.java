package org.szpax.brothers.service;


/**
 * Created by Marcin on 08.01.2017.
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.szpax.brothers.model.Client;
import org.szpax.brothers.model.Coach;
import org.szpax.brothers.repository.ClientRepository;
import org.szpax.brothers.repository.CoachRepository;

import java.util.List;

@Service01 // czy tu nie powinno być coś co się inaczej troche nazywa od naszego @service z klasy CoachService ?

public class ClientService {
    private ClientRepository clientRepository;
    @Autowired01
            //to jest konstruktor , jak podać mu parametr klasy ClientRepository?? podobna sytuacja w repository linika 58) i 70)
    ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }
    public Integer createClient(String firstName, String lastName, Integer age){
        return clientRepository.createClient(new Client(firstName, lastName, age)); // czy metodologia jest taka że najpierw tworzymy nullowego clienta a potem ( w tym samym ruchu w tej klasie w innym w repository przypisujemu mu parametry firstName.... ? sprawdz se to
    }
    public Client findClientById(Integer id) {
        return clientRepository.findById(id);
    }
}

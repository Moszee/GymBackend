package org.szpax.brothers.service;

/**
 * Created by Marcin on 08.01.2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.szpax.brothers.model.Client;
import org.szpax.brothers.repository.ClientRepository;

import java.sql.Date;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

// czy tu nie powinno być coś co się inaczej troche nazywa od naszego @service z klasy CoachService?
@Service
public class ClientService {
    private ClientRepository clientRepository;

    //to jest konstruktor , jak podać mu parametr klasy ClientRepository?? podobna sytuacja w repository linika 58) i 70)
    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    //W tym miejscu Odbieramy Id od Clienta którego podajemy do metody creatClient w clientRepository(new Client) utworzonego
    //wg parametrów podanych tutaj poniżej
    public Client createClient(String firstName, String lastName, Integer birthDate) {
        Client client = new Client();
        client.setFirstName(firstName);
        client.setLastName(lastName);
        client.setBirthDate(Date.from(Instant.ofEpochMilli(birthDate)));
        return clientRepository.save(client);
    }

    public Client findClientById(Integer id) {
        return clientRepository.findOne(id);
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client update(Integer clientId, String firstName, String lastName) {
        Client client = clientRepository.findOne(clientId);
        if (firstName != null && !firstName.isEmpty()) {
            client.setFirstName(firstName);
        }
        if (lastName != null && !lastName.isEmpty()) {
            client.setLastName(lastName);
        }
        return clientRepository.save(client);

    }
}


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

@Service // czy tu nie powinno być coś co się inaczej troche nazywa od naszego @service z klasy CoachService ?

public class ClientService {
    private ClientRepository clientRepository;
    private final static String DIRECTORY="C:\\client_data\\";

    @Autowired
    //to jest konstruktor , jak podać mu parametr klasy ClientRepository?? podobna sytuacja w repository linika 58) i 70)
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    /*
    W tym miejscu Odbieramy Id od Clienta którego podajemy do metody creatClient w clientRepository(new Client) utworzonego
    wg parametrów podanych tutaj poniżej
     */
    public Integer createClient(String firstName, String lastName, Integer age) {
        return clientRepository.createClient(new Client(firstName, lastName, age));
    }

    public Client findClientById(Integer id) {
        return clientRepository.findById(id);
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client update(Integer clientId, String firstName, String lastName, Integer age) {
        Client client = clientRepository.findById(clientId);
        if (firstName != null && !firstName.isEmpty()) {
            client.setFirstName(firstName);
        }
        if (lastName != null && !lastName.isEmpty()) {
            client.setLastName(lastName);
        }
        if (age != null) {
            client.setAge(age);
        }
        return clientRepository.update(client);

    }
    public void loadFromFile(String fileName){
        String absolutePath = DIRECTORY + fileName;
    }
}


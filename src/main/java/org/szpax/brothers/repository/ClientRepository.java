package org.szpax.brothers.repository;

import org.springframework.stereotype.Repository;
import org.szpax.brothers.model.Client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ClientRepository {

    /**
     * to usune, narazie nie mamy bazy danych wiec robie baze danych dla ubogich...
     * Implementacje tych metoda sa slabe, bo nie ma bazy, again.
     * Nie przejmuj sie tym - moge to opisac lepiej jak chcesz pozniej
     */
    private Map<Integer, Client> dbMock = new HashMap<Integer, Client>();

    public ClientRepository() {
        Client client = new Client("Nikodem", "Kozlowski", 27);
        dbMock.put(client.getId(), client);
        Client client1 = new Client("Antoni", "Wysocki", 32);
        dbMock.put(client1.getId(), client1);
        Client client2 = new Client("Franciszek", "Szpak", 31);
        dbMock.put(client2.getId(), client2);
    }

    /**
     * Znajduje Clienta po id
     *
     * @param id
     * @return
     */

    public Client findById(Integer id) {
        return dbMock.get(id);
    }

    /**
     * Znajduje liste Clientow o podanym imieniu i nazwisku
     *
     * @param firstName
     * @param lastName
     * @return
     */
    public List<Client> findByFirstNameAndLastName(String firstName, String lastName) {
        List<Client> toReturn = new ArrayList<Client>();
        for(Client c : dbMock.values()) {
            if(firstName.equals(c.getFirstName()) && lastName.equals(c.getLastName())) {
                toReturn.add(c);
            }
        }
        return toReturn;
    }

    public Integer createClient(Client client) {
        Client existing = findById(client.getId());
        if(existing != null)
            throw new IllegalArgumentException("This client already exist!");
        dbMock.put(client.getId(), client);
        return client.getId();
    }

    public List<Client> findAll() {
        return new ArrayList<Client>(dbMock.values());
    }

    public Client update(Client client) {
        dbMock.put(client.getId(), client);
        return client;
    }
}

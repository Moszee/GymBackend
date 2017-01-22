package org.szpax.brothers.controller;

/**
 * Created by Marcin on 08.01.2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.szpax.brothers.model.Client;
import org.szpax.brothers.service.ClientService;

import java.util.List;

@RestController
@RequestMapping("/Client)")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping("add")
    public Client add(@RequestParam String firstName, @RequestParam String lastName, @RequestParam Integer age) {
        Integer clientId = clientService.createClient(firstName, lastName, age);
        return clientService.findClientById(clientId);
    }

    @RequestMapping("list")
    public List<Client> list() {
        return clientService.findAll();
    }

    @RequestMapping("{clientId}")
    public Client one(@PathVariable int ClientId) {
        return clientService.findClientById(ClientId);
    }

    @RequestMapping("{clientId}/update")
    public Client update(@PathVariable int clientId, @RequestParam(required = false) String firstName, @RequestParam(required = false) String lastName, @RequestParam(required = false) Integer age) {
        return clientService.update(clientId, firstName, lastName, age);
    }

    @RequestMapping("load")
    public void load(@RequestParam String file){}
}

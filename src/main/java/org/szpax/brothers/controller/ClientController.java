package org.szpax.brothers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.szpax.brothers.model.Client;
import org.szpax.brothers.service.ClientService;

import java.util.List;

@RestController
@RequestMapping("/client)")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping("add")
    public Client add(@RequestParam String firstName,
                      @RequestParam String lastName,
                      @RequestParam Integer birthDate) {
        return clientService.createClient(firstName, lastName, birthDate);
    }

    @RequestMapping("list")
    public List<Client> list() {
        return clientService.findAll();
    }

    @RequestMapping("{clientId}")
    public Client one(@PathVariable Long clientId) {
        return clientService.findClientById(clientId);
    }

    @RequestMapping("{clientId}/update")
    public Client update(@PathVariable Long clientId,
                         @RequestParam(required = false) String firstName,
                         @RequestParam(required = false) String lastName) {
        return clientService.update(clientId, firstName, lastName);
    }

    @RequestMapping("load")
    public void load(@RequestParam String file) {
    }
}

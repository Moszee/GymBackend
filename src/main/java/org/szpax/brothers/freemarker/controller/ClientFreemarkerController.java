package org.szpax.brothers.freemarker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.szpax.brothers.model.Client;
import org.szpax.brothers.service.ClientService;

import java.util.Date;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
@RequestMapping("/freemarker/client")
public class ClientFreemarkerController {

    private ClientService clientService;

    @Autowired
    public ClientFreemarkerController(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping("/add")
    public String addClient(Map<String, Object> model) {
        return "addClient";
    }

    @RequestMapping(value = "/save", method = POST)
    public String saveClient(
            @RequestParam String firstName,
            @RequestParam String lastName,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date birthDate,
            Map<String, Object> model) {

        Client client = clientService.createClient(firstName, lastName, birthDate);

        model.put("client", client);

        return "showClient";
    }
}

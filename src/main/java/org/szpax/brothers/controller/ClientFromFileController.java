package org.szpax.brothers.controller;

/**
 * Created by Marcin on 14.01.2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.szpax.brothers.model.Client;
import org.szpax.brothers.model.Coach;
import org.szpax.brothers.service.ClientFromFileService;
import org.szpax.brothers.service.ClientService;
import org.szpax.brothers.service.CoachService;

import java.util.List;

@RestController
@RequestMapping("/File")


public class ClientFromFileController {
    ClientFromFileController(){

    }
    public List<String> getFileName(String fileName){
//        this.fileName = "";
        return null;
    }
}


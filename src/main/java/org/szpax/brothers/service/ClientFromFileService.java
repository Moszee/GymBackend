package org.szpax.brothers.service;

/**
 * Created by Marcin on 14.01.2017.
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.szpax.brothers.model.Client;
import org.szpax.brothers.model.Coach;
import org.szpax.brothers.repository.ClientRepository;
import org.szpax.brothers.repository.CoachRepository;

import java.util.List;

@Service
public class ClientFromFileService {
    @Autowired
    public ClientFromFileService() {
    }
}

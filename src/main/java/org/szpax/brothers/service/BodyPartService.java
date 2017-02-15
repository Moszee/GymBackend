package org.szpax.brothers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.szpax.brothers.model.BodyPart;
import org.szpax.brothers.repository.BodyPartRepository;

import java.util.List;

/**
 * Created by Marcin on 12.02.2017.
 */
@Service
public class BodyPartService {
    private BodyPartRepository bodyPartRepository;

    @Autowired
    public BodyPartService(BodyPartRepository bodyPartRepository) {
        this.bodyPartRepository = bodyPartRepository;
    }

    public BodyPart createBodyPart(String code, String part) {
        BodyPart bodyPart = new BodyPart();
        bodyPart.setCode(code);
        bodyPart.setBodyPart(part);
        return  bodyPartRepository.save(bodyPart);
    }
    public List<BodyPart> findAll() { return bodyPartRepository.findAll();}

}

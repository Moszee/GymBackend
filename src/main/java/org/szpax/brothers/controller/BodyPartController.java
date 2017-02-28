package org.szpax.brothers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.szpax.brothers.model.BodyPart;
import org.szpax.brothers.service.BodyPartService;

import java.util.List;

/**
 * Created by Marcin on 12.02.2017.
 */
@RestController
@RequestMapping("/admin/body-part")
public class BodyPartController {
    private final BodyPartService bodyPartService;

    @Autowired
    public BodyPartController(BodyPartService bodyPartService) { this.bodyPartService = bodyPartService;}

    @RequestMapping("/add")
    public BodyPart add (@RequestParam String code,
                         @RequestParam String part)
    {return bodyPartService.createBodyPart(code,part);}

    @RequestMapping("/List")
    public List<BodyPart> list() {return bodyPartService.findAll();}//aha zastanow sie skad brał sie blad gdy BodyPartService była napisany duza litera... cannot reslove from static contekst

}

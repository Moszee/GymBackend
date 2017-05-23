package org.szpax.brothers.freemarker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.szpax.brothers.model.BodyPart;
import org.szpax.brothers.service.BodyPartService;

import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by Marcin on 22.05.2017.
 */
@Controller
@RequestMapping("/freemarker/client")
public class BodyPartFreemarkerController {

    private BodyPartService bodyPartService;

    @Autowired
    public BodyPartFreemarkerController(BodyPartService bodyPartService) {this.bodyPartService = bodyPartService;}

    @RequestMapping("/add")
    public String addBodyPart(Map<String, Object> model) { return  "addBodyPart";}

    @RequestMapping(value = "/save", method = POST)
    public String saveBodyPart(
            @RequestParam String code,
            @RequestParam String part, Map<String, Object> model) {
                BodyPart bodyPart = bodyPartService.createBodyPart(code,part);
                model.put("bodyPart", bodyPart);
                return "showBodyPart";
    }

}

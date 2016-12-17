package org.szpax.brothers.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * tu wiele pisac chyba nie trzeba - kontroler. Stworzylem go tylko po to, zeby sprawdzic czy apka dziala ; )
 *
 */
@RestController
public class HelloWorldController {

    /**
     * Adres: http://localhost:8080/hello
     *
     * @return hello world! :)
     */

    @RequestMapping("/hello")
    public String helloWorld() {
        return "helloWorld!";
    }

}

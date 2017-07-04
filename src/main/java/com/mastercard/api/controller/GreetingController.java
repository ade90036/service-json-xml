package com.mastercard.api.controller;

/**
 * Created by andrearizzini on 03/07/2017.
 */
import com.mastercard.api.model.Greeting;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping(value = "/greeting", method = RequestMethod.POST, produces={"application/json","application/xml"},
            consumes={"application/json", "application/xml"})
    public Greeting greeting(@RequestBody Greeting greeting) {

        if (greeting.getMessage().contains("RuntimeException")) {
            throw new RuntimeException("Test runtime exception");
        }

        return new Greeting(greeting.getMessage()+" from response");
    }
}
package com.springboot.template.greeting;

import com.springboot.template.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GreetingController {

    private static List<Greeting> greetings = new ArrayList<>();

    static {
        greetings.add(new Greeting("Hello", "English"));
        greetings.add(new Greeting("Gracias!", "Whatever"));
    }

    @RequestMapping(value = "/greetings", method = RequestMethod.GET)
    public List<Greeting> getAllGreetings() {
        return greetings;
    }

    @RequestMapping(value = "/greetings", method = RequestMethod.POST)
    public Greeting postGreeting(@RequestBody(required = true) Greeting greeting) {
        greetings.add(greeting);
        return greeting;
    }

    @RequestMapping(value = "/greetings/{id}", method = RequestMethod.GET)
    public Greeting getGreetingById(@PathVariable int id) {
        for(Greeting greeting : greetings) {
            if(greeting.getId() == id) {
                return greeting;
            }
        }
        throw new ResourceNotFoundException();
    }
}
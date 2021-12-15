package com.activiti.extension.api;

import com.activiti.extension.rest.GreetingMessage;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/enterprise")
public class HelloWorldRestController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public GreetingMessage sayHello(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        GreetingMessage msg = new GreetingMessage(name, "Hello " + name + "!");
        return msg;
    }

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public GreetingMessage sayHelloAgain(@PathVariable String name) {
        GreetingMessage msg = new GreetingMessage(name, "Hello " + name + "!");
        return msg;
    }
}
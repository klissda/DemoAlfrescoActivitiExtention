package com.activiti.extension.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldRestController {

    @RequestMapping(value = "/", method= RequestMethod.GET)
    public GreetingMessage sayHello(@RequestParam(value="name", required=false,
            defaultValue="World") String name) {
        GreetingMessage msg = new GreetingMessage(name, "Hello " + name + "!");
        return msg;
    }

    @RequestMapping(value = "/{name}", method= RequestMethod.GET)
    public GreetingMessage sayHelloAgain(@PathVariable String name) {
        GreetingMessage msg = new GreetingMessage(name, "Hello " + name + "!");
        return msg;
    }
}
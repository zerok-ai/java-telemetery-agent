package src.main.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import src.main.service.GreetService;

@RestController
public class HelloController {
    @RequestMapping("/hello/{name}")
    public String sayHi(@PathVariable("name") String name) {
        String val;
        if (!name.equals("vaibhav")) {
            name = null;
        }
        GreetService g = new GreetService();
        try {
            val = String.format("{\"val\":\"%s\"}", g.greeter(name));
        } catch (Exception e) {
            val = "{\"val\":\"invalid_val\"}";
        }
        return val;
    }
}

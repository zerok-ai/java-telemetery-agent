package src.main.service;

import org.springframework.web.client.RestTemplate;

public class GreetService {

    public String greeter(String person) throws Exception {
        if (person == null) {
            throw new Exception("invalid value");
        } else {
            RestTemplate restTemplate = new RestTemplate();
            Object result = restTemplate.getForObject("http://localhost:8081/topics", Object.class);
            return "Hi " + person;
        }
    }
}
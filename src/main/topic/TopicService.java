package src.main.topic;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;
    private List<Topic> topics  = new ArrayList<>(Arrays.asList(
            new Topic("a1", "b1", "c1"),
            new Topic("a2", "b2", "c2"),
            new Topic("a3", "b3", "c3"))
    );

    public List<Topic> getAllTopics() {
        List<Topic> t = new ArrayList<>();
//        topicRepository.findAll().forEach(t::add);
        topicRepository.findAllSortedByName("bx").forEach(t::add);
        return t;
    }

    public void addTopic(Topic topic)  {

        topicRepository.save(topic);
//        topics.add(topic);
//        ObjectMapper objectMapper = new ObjectMapper();
//        RestTemplate restTemplate = new RestTemplate();
//        Object result = restTemplate.getForObject("http://localhost:8080/topics", Object.class);
//        try {
//
//            String resultString = objectMapper.writeValueAsString(result);
//            System.out.println(resultString);
//
//        } catch (Exception e) {
//            System.out.println("error");
//        }
//
//        Object result2 = restTemplate.getForObject("http://localhost:8080/hello/vaibhav", Object.class);
//        Object result3 = restTemplate.getForObject("http://localhost:8080/hello/invalid_name", Object.class);


    }
}

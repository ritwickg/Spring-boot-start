package springboot.starter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/topic")
@CrossOrigin(origins = "http://localhost:8998")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/welcome")
    public String welcomeUser() {
        return "Hi";
    }

    @RequestMapping("/getAll")
    public List<Topic> getAll() {
       return this.topicService.getAllTopics();
    }

    @RequestMapping("getById/{id}")
    public Topic getTopicById(@PathVariable String id) {
        return this.topicService.getTopicById(id);
    }
}

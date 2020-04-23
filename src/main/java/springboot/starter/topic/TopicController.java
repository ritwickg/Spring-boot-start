package springboot.starter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topic")
@CrossOrigin(origins = "http://localhost:8998")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/welcome")
    public String welcomeUser() {
        return "Hi";
    }

    @GetMapping("/getAll")
    public List<Topic> getAll() {
       return this.topicService.getAllTopics();
    }

    @GetMapping("getById/{id}")
    public Topic getTopicById(@PathVariable String id) {
        return this.topicService.getTopicById(id);
    }

    // @RequestMapping(method = RequestMethod.POST,value = "/addTopic")
    @PostMapping("/addTopic")
    public void addTopic(@RequestBody List<Topic> topicRequestBody) {
        this.topicService.addTopic(topicRequestBody);
    }

    @PutMapping("/updateTopic/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id)  {
        this.topicService.updateTopic(id,topic);
    }

    @DeleteMapping("/deleteTopic/{id}")
    public  void deleteTopic(@PathVariable String id){
        this.topicService.deleteTopicById(id);
    }

}

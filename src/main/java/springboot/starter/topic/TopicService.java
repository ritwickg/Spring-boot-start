package springboot.starter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topicList = Arrays.asList(
      new Topic("1","Ritwick","demo user1"),
      new Topic("2","Juhi", "demo user 2")
    );

    public List<Topic> getAllTopics() {
        return this.topicList;
    }

    public Topic getTopicById(String id) {
        return this.getAllTopics().stream().filter(x -> x.get_id().equals(id)).findFirst().get();
    }
}

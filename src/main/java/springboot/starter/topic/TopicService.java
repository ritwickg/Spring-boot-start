package springboot.starter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topicList = new ArrayList<>(Arrays.asList(
      new Topic("1","Ritwick","demo user1"),
      new Topic("2","Juhi", "demo user 2")
    ));

    public List<Topic> getAllTopics() {
        return this.topicList;
    }

    public Topic getTopicById(String id) {
        return this.getAllTopics().stream().filter(x -> x.getId().equals(id)).findFirst().get();
    }

    public void addTopic(List<Topic> topic) {
        this.topicList.addAll(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (int i=0;i<topicList.size();i++) {
            if(topicList.get(i).getId().equals(id)) {
                topicList.set(i,topic);
            }
        }
    }

    public void deleteTopicById(String id) {
        this.topicList.removeIf(x -> x.getId().equals(id));
    }
}

package springboot.starter.topic;

public class Topic {

    public String name;
    public String id;
    public String description;

    public Topic() {

    }
    public Topic(String id, String name, String descrition) {
        this.id = id;
        this.description = descrition;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}


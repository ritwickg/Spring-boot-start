package springboot.starter.topic;

public class Topic {

    private String _name;
    private String _id;
    private String _description;

    public Topic() {

    }
    public Topic(String id, String name, String descrition) {
        this._id = id;
        this._description = descrition;
        this._name = name;
    }

    public String get_name() {
        return _name;
    }

    public String get_id() {
        return _id;
    }

    public String get_description() {
        return _description;
    }

}


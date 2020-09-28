package hello;

import org.joda.time.LocalTime;

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        LocalTime currentTime = new LocalTime();
        return content;
    }
}

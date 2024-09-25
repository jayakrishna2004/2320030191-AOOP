package socialmedia;

import java.time.LocalDateTime;
import java.util.List;

public class Post {
    private String user;
    private String content;
    private List<String> tags;
    private LocalDateTime timestamp;

    public Post(String user, String content, List<String> tags, LocalDateTime timestamp) {
        this.user = user;
        this.content = content;
        this.tags = tags;
        this.timestamp = timestamp;
    }

    public String getUser() {
        return user;
    }

    public String getContent() {
        return content;
    }

    public List<String> getTags() {
        return tags;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Post{" +
                "user='" + user + '\'' +
                ", content='" + content + '\'' +
                ", tags=" + tags +
                ", timestamp=" + timestamp +
                '}';
    }
}

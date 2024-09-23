package socialmedia;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class FeedFilter {

    
    public static List<Post> filterByUser(List<Post> posts, String user) {
        return posts.stream()
                .filter(post -> post.getUser().equalsIgnoreCase(user))
                .collect(Collectors.toList());
    }

   
    public static List<Post> filterByTags(List<Post> posts, List<String> tags) {
        return posts.stream()
                .filter(post -> post.getTags().stream().anyMatch(tags::contains))
                .collect(Collectors.toList());
    }

   
    public static List<Post> filterByKeyword(List<Post> posts, String keyword) {
        return posts.stream()
                .filter(post -> post.getContent().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

   
    public static List<Post> filterByTimeRange(List<Post> posts, LocalDateTime start, LocalDateTime end) {
        return posts.stream()
                .filter(post -> post.getTimestamp().isAfter(start) && post.getTimestamp().isBefore(end))
                .collect(Collectors.toList());
    }
}

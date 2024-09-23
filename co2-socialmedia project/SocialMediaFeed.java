package socialmedia;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class SocialMediaFeed {

    public static void main(String[] args) {
        List<Post> posts = Arrays.asList(
            new Post("Alice", "Had a great day at the park!", Arrays.asList("park", "fun"), LocalDateTime.now().minusDays(1)),
            new Post("Bob", "Loving the new Java 17 features", Arrays.asList("java", "programming"), LocalDateTime.now().minusHours(2)),
            new Post("Charlie", "The weather is amazing today", Arrays.asList("weather", "sunny"), LocalDateTime.now().minusMinutes(30)),
            new Post("Alice", "Watching a great movie tonight!", Arrays.asList("movie", "entertainment"), LocalDateTime.now().minusDays(3))
        );

       
        List<Post> alicePosts = FeedFilter.filterByUser(posts, "Alice");
        System.out.println("Posts by Alice:");
        alicePosts.forEach(System.out::println);

        
        List<Post> programmingPosts = FeedFilter.filterByTags(posts, Arrays.asList("programming", "java"));
        System.out.println("\nPosts about programming:");
        programmingPosts.forEach(System.out::println);

        
        List<Post> weatherPosts = FeedFilter.filterByKeyword(posts, "weather");
        System.out.println("\nPosts containing the word 'weather':");
        weatherPosts.forEach(System.out::println);

    
        List<Post> recentPosts = FeedFilter.filterByTimeRange(posts, LocalDateTime.now().minusHours(3), LocalDateTime.now());
        System.out.println("\nPosts from the last 3 hours:");
        recentPosts.forEach(System.out::println);
    }
}


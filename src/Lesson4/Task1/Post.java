package Lesson4.Task1;

import java.util.Date;

/**
 * Created by Zu on 25.11.2017.
 */
public class Post {

    int postId;
    String title;
    Date postedAt;

    public Post(int postId, String title, Date postedAt) {
        this.postId = postId;
        this.title = title;
        this.postedAt = postedAt;
    }
}

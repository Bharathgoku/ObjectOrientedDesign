package ObjectOrientedDesign.LinkedIn.entities;

import java.time.LocalDateTime;
import java.util.List;

public class Post {

    private Integer postId;
    private static Integer counter = 0;
    private String text;
    private LocalDateTime createdAt;
    private Member createdBy;
    private List<Integer> likes;
    private List<Comment> comments;

}

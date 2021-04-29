package ObjectOrientedDesign.LinkedIn.entities;

import java.time.LocalDateTime;

public class Message {

    private Integer MessageId;
    private static Integer counter = 0;
    private String text;
    private Member from;
    private Member to;
    private LocalDateTime createdAt;

}

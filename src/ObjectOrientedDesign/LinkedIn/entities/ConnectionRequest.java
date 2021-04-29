package ObjectOrientedDesign.LinkedIn.entities;

import ObjectOrientedDesign.LinkedIn.entities.Member;
import ObjectOrientedDesign.LinkedIn.enums.ConnectionRequestStatus;
import java.time.LocalDateTime;

public class ConnectionRequest {

    private Integer requestId;
    private static Integer counter = 0;
    private Member requestedTo;
    private Member requestFrom;
    private LocalDateTime requestedAt;
    private ConnectionRequestStatus connectionRequestStatus;

}

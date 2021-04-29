package ObjectOrientedDesign.LinkedIn.entities;

import java.util.Set;

public class Group {

    private Integer groupId;
    private static Integer counter = 0;
    private String groupName;
    private GroupData groupData;
    private Set<Integer> membersList;

    class GroupData{
        private String groupName;
        private String description;
    }


}

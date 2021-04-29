package ObjectOrientedDesign.LinkedIn.services;

import ObjectOrientedDesign.LinkedIn.DataStore.GroupData;
import ObjectOrientedDesign.LinkedIn.entities.Group;
import java.util.List;

public interface GroupService {

    Group createGroup(String name, Integer createdBy);

    Group addMembersToGroup(Integer groupId, List<Integer> membersToAdd, Integer addingBy);

    Group removeMembersFromGroup(Integer groupId, List<Integer> membersToRemove, Integer removedBy);

    void deleteGroup(Integer groupId, Integer deletingBy);

    Group updateGroupData(GroupData groupData, Integer groupId, Integer changedBy);

}

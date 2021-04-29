package ObjectOrientedDesign.LinkedIn.services;

import ObjectOrientedDesign.LinkedIn.entities.Chat;

public interface MessagingService {

    Chat sendMessageToMember(String text, Integer fromId, Integer toId);

    Chat getChat(Integer fromId, Integer toId);



}

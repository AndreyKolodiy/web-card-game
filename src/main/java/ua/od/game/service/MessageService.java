package ua.od.game.service;

import ua.od.game.dto.MessageDto;

import java.util.Date;
import java.util.List;

public interface MessageService {
    List<MessageDto> getMessageList();
    Boolean sendMessage(MessageDto message);
}

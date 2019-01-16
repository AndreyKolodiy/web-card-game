package ua.od.game.repository.dao.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.util.calendar.BaseCalendar;
import ua.od.game.model.MessageEntity;
import ua.od.game.repository.dao.MessageDao;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Andrey Kolodiy
 */

public class MessageDaoImplTest {
    MessageDaoImpl messageDao;

    @Before
    public void init(){
        messageDao = new MessageDaoImpl();}

    @Test
    public void getMessageList() {
        List<MessageEntity> message = messageDao.getMessageList(111,222,new Date(2019-01-15-10-59-00));
        for (int i = 0; i < message.size(); i++) {
            System.out.print(message.get(i).getFromAccountId() + " ");
            System.out.print(message.get(i).getToAccountId() + " ");
            System.out.print(message.get(i).getText()+ " ");
            System.out.print(message.get(i).getTime()+ " ");
        }

    }

    @Test
    public void sendMessage() {
    }
}
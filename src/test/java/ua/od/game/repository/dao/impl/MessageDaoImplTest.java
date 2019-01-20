package ua.od.game.repository.dao.impl;


import org.junit.Before;
import org.junit.Test;
import ua.od.game.model.MessageEntity;
import ua.od.game.repository.dao.DbTest;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertNotEquals;

/**
 * @author Andrey Kolodiy
 */

public class MessageDaoImplTest extends DbTest {
    MessageDaoImpl messageDao;

    @Before
    public void init() {
        messageDao = new MessageDaoImpl();
    }

    @Test
    public void getMessageListTest() {
        String dateText = "2019-01-15 10:45:00";
        Date dateTime = Timestamp.valueOf(dateText);
        Date counterDateTame = null;
        List<MessageEntity> message = messageDao.getMessageList(222, 111, dateTime);
        for (int i = 0; i < message.size(); i++) {
            System.out.print("From account: " + message.get(i).getFromAccountId() + " ");
            System.out.println("To account: " + message.get(i).getToAccountId() + " ");
            System.out.println("Text  Message: " + message.get(i).getText() + " ");
            System.out.println("Date and time: " + message.get(i).getTime() + " ");
            System.out.println(" ");
            counterDateTame = message.get(i).getTime();
        }

        assertNotEquals(counterDateTame, dateTime);
    }

    @Test
    public void sendMessageTest() {
    }
}
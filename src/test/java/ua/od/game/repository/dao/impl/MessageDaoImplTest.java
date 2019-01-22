package ua.od.game.repository.dao.impl;


import org.junit.Before;
import org.junit.Test;
import ua.od.game.model.MessageEntity;
import ua.od.game.repository.dao.DbTest;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * @author Andrey Kolodiy
 */

public class MessageDaoImplTest extends DbTest {
    MessageDaoImpl messageDao;

    private static final int fromAccountId = 222;
    private static final int toAccountId = 111;
    private final String dateText = "2019-01-15 10:45:00";
    private final Date dateTime = Timestamp.valueOf(dateText);

    @Before
    public void init() {
        messageDao = new MessageDaoImpl();
    }

    @Test
    public void getMessageListTest() {
        boolean result = Boolean.parseBoolean(null);
        List<MessageEntity> messages = messageDao.getMessageList(fromAccountId, toAccountId, dateTime);
        for (MessageEntity massages : messages) {
            if (massages.getFromAccountId() == fromAccountId && massages.getToAccountId() == toAccountId && massages.getTime().after(dateTime))
                result = true;
        }
        assertTrue(result);
    }

    @Test
    public void sendMessageTest() {
    }
}
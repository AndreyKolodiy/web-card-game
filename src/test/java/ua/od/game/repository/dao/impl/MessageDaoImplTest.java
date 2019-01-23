package ua.od.game.repository.dao.impl;


import org.junit.Before;
import org.junit.Test;
import ua.od.game.repository.dao.DbTest;

import java.sql.Timestamp;
import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * @author Andrey Kolodiy
 */

public class MessageDaoImplTest extends DbTest {
    MessageDaoImpl messageDao;

    private static final Integer FROM_ACCOUNT_ID = 222;
    private static final Integer TO_ACCOUNT_ID = 111;
    private final String dateText = "2019-01-15 10:45:00";
    private final Date DATETIME = Timestamp.valueOf(dateText);

    @Before
    public void init() {
        messageDao = new MessageDaoImpl();
    }

    @Test
    public void getMessageListTest() {
        messageDao.getMessageList(FROM_ACCOUNT_ID, TO_ACCOUNT_ID, DATETIME).forEach(message -> {
            assertEquals(FROM_ACCOUNT_ID, message.getFromAccountId());
            assertEquals(TO_ACCOUNT_ID, message.getToAccountId());
            assertTrue(message.getTime().after(DATETIME));
        });
    }

    @Test
    public void sendMessageTest() {
    }
}
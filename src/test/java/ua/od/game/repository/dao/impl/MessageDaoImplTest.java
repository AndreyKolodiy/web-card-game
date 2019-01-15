package ua.od.game.repository.dao.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

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

        Assert.assertTrue(!messageDao.getMessageList(111,222,new Date()).isEmpty());
        Assert.assertTrue(!messageDao.getMessageList(111,222,new Date()).isEmpty());
        Assert.assertTrue(!messageDao.getMessageList(222,111,new Date()).isEmpty());
    }

    @Test
    public void sendMessage() {
    }
}
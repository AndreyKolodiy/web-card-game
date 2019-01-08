package ua.od.game.repository.dao.impl;

import ua.od.game.model.MessageEntity;
import ua.od.game.repository.dao.MessageDao;
import ua.od.game.repository.helper.SqlHelper;

import java.sql.ResultSet;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class MessageDaoImpl implements MessageDao {

    @Override
    public List<MessageEntity> getMessageList(Integer fromAccountId, Integer toAccountId, Date fromTime) {
        MessageEntity message = SqlHelper.prepareStatement("SELECT * FROM Message WHERE from_account_id = ? AND to_account_id = ? AND time = ?", pstmt -> {
            pstmt.setInt(1, fromAccountId);
            pstmt.setInt(2, toAccountId);
            pstmt.setDate(3, (java.sql.Date) fromTime);
            ResultSet rs = pstmt.executeQuery();
            return rs.next() ? new MessageEntity() {{
                setFromAccountId(rs.getInt("from_account_id"));
                setToAccountId(rs.getInt("to_account_id"));
                setTime(rs.getDate("time"));
                setText(rs.getString("text"));
            }} : null;
        });

        return Collections.singletonList(message);
    }


    @Override
    public Boolean sendMessage(MessageEntity message) {
        return null;
    }
}


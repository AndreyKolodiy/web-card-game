package ua.od.game.model;

import java.util.Date;

public class MessageEntity {
    private Integer id;
    private String text;
    private Integer fromAccountId;
    private Integer toAccountId;
    private Date time;

<<<<<<< HEAD

=======
>>>>>>> ec350be74a77872a13d9b2aaedea7c845166f66b
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getFromAccountId() {
        return fromAccountId;
    }

    public void setFromAccountId(Integer fromAccountId) {
        this.fromAccountId = fromAccountId;
    }

<<<<<<< HEAD
    public Integer getToAccountId() {
        return toAccountId;
    }

    public void setToAccountId(Integer toAccountId) {
        this.toAccountId = toAccountId;
    }
=======
    public void setToAccountId(Integer toAccountId) {
        this.toAccountId = toAccountId;
    }
  
    public Integer getToAccountId() {
        return toAccountId;
    }
>>>>>>> ec350be74a77872a13d9b2aaedea7c845166f66b

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}




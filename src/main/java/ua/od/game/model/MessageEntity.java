package ua.od.game.model;

import java.util.Date;

public class MessageEntity {
    private Integer id;
    private String text;
    private Integer fromAccountId;
    private Integer toAccountId;
    private Date time;


    public void setFromAccountId(Integer fromAccountId) {
        this.fromAccountId = fromAccountId;
    }
    public void setToAccountId(Integer toAccountId) {
        this.toAccountId = toAccountId;
    }
    public void setTime (Date time){
        this.time = time;
    }
    public void setText (String text){
        this.text = text;
    }
    public void setId (Integer id){
        this.id = id;
    }
}

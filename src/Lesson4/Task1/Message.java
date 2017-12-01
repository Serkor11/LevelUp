package Lesson4.Task1;

import java.util.Date;
import java.util.Objects;

/**
 * Created by Zu on 25.11.2017.
 */
public class Message {

    private int messageId;
    private String text;
    private User author;
    private Date date;

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Message))
            return false;

        Message other = (Message) object;
        return messageId == other.messageId &&
                text.equals(other.text) &&
                author.equals(other.author) &&
                date.equals(other.date);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + messageId;
        result = 31 * result + text.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + date.hashCode();
        return result;
    }
}

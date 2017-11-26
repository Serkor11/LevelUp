package Lesson4;

import java.util.Date;

/**
 * Created by Zu on 26.11.2017.
 */
public class Report {

    private String author;
    private Date date;

    public Report(String author, Date date) {
        this.author = author;
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

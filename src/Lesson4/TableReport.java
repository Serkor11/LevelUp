package Lesson4;

import java.util.Date;

/**
 * Created by Zu on 26.11.2017.
 */
public class TableReport extends Report{
    private int rolCount;
    private int colCount;

    public TableReport(String author, Date date, int rolCount, int colCount) {
        super(author, date);
        this.rolCount = rolCount;
        this.colCount = colCount;
    }

    public int getRolCount() {
        return rolCount;
    }

    public void setRolCount(int rolCount) {
        this.rolCount = rolCount;
    }

    public int getColCount() {
        return colCount;
    }

    public void setColCount(int colCount) {
        this.colCount = colCount;
    }
}


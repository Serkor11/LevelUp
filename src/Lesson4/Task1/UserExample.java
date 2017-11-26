package Lesson4.Task1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Zu on 25.11.2017.
 */
public class UserExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        calendar.set(1,2,3);
        User user1 = new User(123,"Имя",calendar.getTime());
        System.out.println(user1.name + " " + user1.userId + " " + simpleDateFormat.format(calendar.getTime()));
    }

}

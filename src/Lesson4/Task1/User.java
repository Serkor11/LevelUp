package Lesson4.Task1;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Zu on 25.11.2017.
 */
public class User {

    int userId;
    String name;
    String lastName;
    String email;
    Date registrationDate;

    public User(int userId, String name,/* String lastName, String email,*/ Date registrationDate){
        this.userId = userId;
        this.name = name;
        //this.lastName = lastName;
        //this.email = email;
        this.registrationDate = registrationDate;
    }

}

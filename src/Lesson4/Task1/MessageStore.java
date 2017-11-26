package Lesson4.Task1;

import java.util.Random;

/**
 * Created by Zu on 25.11.2017.
 */
public class MessageStore {
     private String[] Message = new String[10];

     MessageStore (String[] message)
     {Message = message;}

    void add(){
        for (int i = 0; i < Message.length; i++) {
            Message[i] = "Строка" + (i+1);
            System.out.println(Message[i]);
        }
    };

}

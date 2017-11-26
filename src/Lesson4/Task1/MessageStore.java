package Lesson4.Task1;

import java.util.Random;

/**
 * Created by Zu on 25.11.2017.
 */
public class MessageStore {
     String[] Message = new String[10];

     MessageStore (String[] Message)
     {this.Message = Message;}

     void add(){
Random random = new Random();
        for (int i = 0; i < Message.length; i++) {
            //Message[i] = random.ne
            // /Message[i] = "Строка" + (i+1);
            System.out.println(Message[i]);
        }
    };

}

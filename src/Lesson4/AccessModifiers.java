package Lesson4;

/**
 * Created by Zu on 26.11.2017.
 */
public class AccessModifiers {

    public int a = 123;
    private int d = 2;

    public int setd(int d) {
        if(d<0) {
            this.d = 0;
        }else
            this.d = d;
        return d;
    }


    public int getD(){
        return d;
    }
}

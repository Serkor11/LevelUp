package Lesson6.Interface;

/**
 * Created by Zu on 03.12.2017.
 */
public class Bird implements Singable{

    protected String position;
    protected double wingsSize;

    @Override
    public void sing() {
        System.out.println("Sing bird");
    }

    void ChangePosition() {
this.position = "fefef";
    }
}
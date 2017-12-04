package Lesson6.Interface;

/**
 * Created by Zu on 03.12.2017.
 */
public class InterfaceExample {

    private static void flyAll(Flyable[] flyable){
        for (Flyable flyable1:flyable){
            flyable1.fly("","");
        }
    }


    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.ChangePosition();
        System.out.println(bird.position);

        Parrot parrot = new Parrot();

        parrot.sing();
        parrot.fly("dd", "fdf");

        Singable singable = new Bird();
        singable.sing();

        bird.sing();

        parrot.sing();



    }

}

package Lesson6.Interface;

/**
 * Created by Zu on 03.12.2017.
 */
public class Parrot extends Bird implements Flyable,Singable{


    @Override
    public void fly(String positionA, String positionB) {

        if (positionA.length() - positionB.length() < 0){
            System.out.println("To much distance");
        } else{
            System.out.println("ddww");
        }

        }


    @Override
    public void sing() {
        System.out.println("Sing Parrot");
    }

    void ff(){
        System.out.println("Parrot");
    }


}

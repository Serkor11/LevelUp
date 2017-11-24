package Lesson2.Task1;
import java.util.Scanner;
import static java.lang.Math.round;

/**
 * Created by Zu on 19.11.2017.
 */
public class Task1 {
    public static void main(String[] args) {

        double number;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите число");
        number = scaner.nextDouble();

        int rounded = (int) round(number);
        System.out.println("Округляем до" + rounded);

    }
}

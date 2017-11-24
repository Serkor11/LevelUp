package Lesson3.Homework3.Task1;

import java.util.Random;

/**
 * Created by Zu on 23.11.2017.
 */
public class PerformMassiv {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
            System.out.println(array[i]);
        }

        Massiv massiv = new Massiv(array);
        massiv.min();
        massiv.max();
    }
}
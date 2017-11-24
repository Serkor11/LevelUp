package Lesson2.Task3;

import java.util.Random;

/**
 * Created by Zu on 19.11.2017.
 */
public class Task3 {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
            System.out.println(array[i]);
        }

        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
            else {
                if (max < array[i]) {
                    max = array[i];
                }
            }
        }
        System.out.println("Минимум " + min);
        System.out.println("Максимум " + max);
    }
}


package Lesson3.Homework3.Task1;

/**
 * Created by Zu on 23.11.2017.
 */
public class Massiv {

    int[] array;

    Massiv(int arr[]) {
        array = arr;
    }

    int min() {
        int min = array[0];
        for (int i = 0; i < array.length; i++)
            if (min > array[i]) {
                min = array[i];
            }
        System.out.println("Минимум = " + min);
        return min;
    }

    int max() {
        int max = array[0];
        for (int i = 0; i < array.length; i++)
            if (max < array[i]) {
                max = array[i];
            }
        System.out.println("Максимум = " + max);
        return max;
    }
}

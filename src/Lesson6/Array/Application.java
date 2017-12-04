package Lesson6.Array;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Zu on 03.12.2017.
 */
public class Application {

    public static void main(String[] args) {
        CustomList list = new DynamicArrayList();
        list.print();
        System.out.println("Начинаем заполнение");
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(10);
        list.add(80);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        list.add(66);
        System.out.println("Массив:");
        list.print();
        System.out.println("Длина массива " + list.getArrayLenght());

        System.out.println("Удаляем");
        list.remove(4);
        list.print();


    }
}

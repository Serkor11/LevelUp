package Lesson4;

/**
 * Created by Zu on 26.11.2017.
 */
public class AccessModifiersExample {
    public static void main(String[] args) {

        AccessModifiers accessModifiers = new AccessModifiers();
        accessModifiers.a = 1;
        System.out.println(accessModifiers.a);
        AccessModifiers accessModifiers1 = new AccessModifiers();
        System.out.println(accessModifiers1.a);

        int z = accessModifiers.getD();
        z += 2;
        System.out.println(z);
    }
}


package Lesson3;

/**
 * Created by Zu on 23.11.2017.
 */
public class Application {

    public static void main(String[] args) {

        Country country = new Country("Moscow2");
        System.out.println(country.capital);
//        country.capital = "Moscow";
        System.out.println(country.capital);
        System.out.println(country.countPeople);


        Country china = new Country("");
        System.out.println(china.capital);

        Country england = new Country("London",34334,3434.43);
        double density = england.density();
        System.out.println(density);
        england.getTimeAtCity("");
    }
}

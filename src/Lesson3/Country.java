package Lesson3;

/**
 * Created by Zu on 23.11.2017.
 */
public class Country {

    String capital;
    long countPeople;
    double areaSquare;

    Country(String cap){
        capital=cap;
    }

    Country (String cap, long count, double square) {
        capital = cap;
        countPeople = count;
        areaSquare = square;
    }

    double density(){

         double density = areaSquare / countPeople;
        return density;
    }

    long getTimeAtCity (String city){
        long now = System.currentTimeMillis();
        if (city.equals("Moscow")){
            return now + 1000 * 3600 * 3;
        }
        return now;
    }

    void print() {

        System.out.println("wwwf");
    }

}

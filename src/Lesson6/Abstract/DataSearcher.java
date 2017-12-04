package Lesson6.Abstract;

/**
 * Created by Zu on 04.12.2017.
 */
public abstract class DataSearcher {


    public abstract String addCondition();


    public void search(){
        String query = "select all from users" + addCondition();
        System.out.println(query);
    }
}

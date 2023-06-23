//import java.date;
import java.util.Date;

public class Date_class {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d.toInstant());
    }
}
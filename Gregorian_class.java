import java.util.*;

public class Gregorian_class {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2028));
        System.out.println(gc.getGregorianChange());
        for(int i = 0; i<5;i++){
           System.out.println(TimeZone.getAvailableIDs()[i]);
        }
    }
}

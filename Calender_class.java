import java.util.Calendar;

public class Calender_class {
    public static void main(String[] args) {
        Calendar c =  Calendar.getInstance();
        System.out.println(c.getInstance());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getCalendarType());
        System.out.println(c.getWeeksInWeekYear());
        System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
    }
}
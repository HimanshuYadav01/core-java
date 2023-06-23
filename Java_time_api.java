import java.security.cert.LDAPCertStoreParameters;
import java.time.*;

public class Java_time_api {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalTime t = LocalTime.now();
        System.out.println(t);
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

    }
}

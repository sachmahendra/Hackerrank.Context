
 import java.util.*;
import java.time.*;

public class L263JavaTimeClasses {
    public static void main(String[] args) {
        
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/Los_Angeles")); // all about current time
        System.out.println("1 :"+zdt);

        MonthDay md = MonthDay.now();

        Period p =Period.of(2,2,10);
        System.out.println("2 :"+p.addTo(LocalDate.now()));

        Instant i=Instant.now();
        System.out.println("4 :"+i);


       
    }
}
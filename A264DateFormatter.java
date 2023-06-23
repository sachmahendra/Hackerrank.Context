import java.util.*;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.*;

public class A264DateFormatter {
    public static void main(String[] args) {
        
       LocalDateTime dt = LocalDateTime.now();

     //  ZonedDateTime dt = ZonedDateTime.now();
      /*  DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy");

        System.out.println(dt);  // run and check the diffrence in output of line 11 and 12
        System.out.println(df.format(dt));

        */ 

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy  hh:mm:ss");

     //  DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy  hh:mm:ss z"); // if here i mention
     // z also to show zone in output then it will show error to show zone we have to use line 10 at place of line 8

        System.out.println(df.format(dt));

        

    }
}

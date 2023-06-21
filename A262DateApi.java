import java.util.*;
import java.time.*;

public class A262DateApi {
    public static void main(String[] args) {
        
        LocalTime t = LocalTime.now();
        System.out.println("1 :"+t);

        LocalTime t1 = t.minusHours(3);
        System.out.println("2 :"+t1);

        LocalDateTime dt = LocalDateTime.now(); //uses time and date both together
        System.out.println("3 :"+dt);

        //THERE IS MANY MORE API'S IN THIS WHICH WE CAN CHECK IN IT
 
    }
}
package arrays;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.YEARS;
import java.util.Scanner;

public class AgeClass {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
        
        //String s = "2018-09-16";
        LocalDate x = LocalDate.parse(s);
        System.out.println(x);
        long z = YEARS.between(x, LocalDate.now().plusDays(0));
        System.out.println(z);
        LocalDate y = x.plusYears(10);
        System.out.println(y);
        
    }
    
}

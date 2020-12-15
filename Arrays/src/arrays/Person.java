package arrays;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.YEARS;

public class Person {
    
    private String name2;
    private String name;
    private String date;

    public Person(String name, String date) {
        this.name = name;
        this.date = date;
    }
    
    //getter and setter for instance filed/variable date, which is personnummer
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    //getter and setter for instance filed/variable name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name= " + name + ", date= " + date;
    }

    long calculateAge() {
        LocalDate birthdate = LocalDate.parse(date);
        LocalDate now = LocalDate.now();
        
        long age = YEARS.between(birthdate, now);
        return age;
    }



    
}

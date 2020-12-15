package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static streams.Streams.students;

class Student {

    int age;
    int programLength;

    public Student() {
        age = (int) (Math.random() * 45 + 1);
        programLength = (int) (Math.random() * 6 + 1);
    }
}

public class Streams {

    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 1; i <= 100_000_000; i++) {
            students.add(new Student());
        }

        boolean loop = true;
        Scanner sc = new Scanner(System.in);

        while (loop) {
            System.out.print("Select a count method ([1] ageByLoop, [2] Stream, ");
            int selection = sc.nextInt();
            sc.nextLine();

            switch (selection) {
                case 1:
                    countByAgeLoop(35);
                    break;
                case 2:
                    countByAgeStream(35);
                    break;
                default:
                    System.out.println("wrong input");
            }
        }

    }

    public static void countListLoop(List list) {
        int i = 0;
        for (Object object : list) {
            ++i;
        }
        System.out.println(i);
    }

    public static void countListStream(List list) {
        long i = list.stream().count();
        System.out.println(i);
    }

    public static void countByAgeLoop(int age) {
        int countAge = 0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).age == age) {
                ++countAge;
            }
        }
        System.out.println(countAge);

    }

    private static void countByAgeStream(int age) {
        long count
                = students.stream()
                        .filter(s -> s.age == age)
                        .count();

        System.out.println(count);
    }
}

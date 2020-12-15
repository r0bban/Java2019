//package arrays2;

import java.util.Scanner;

public class Arrays2 {

    static Scanner sc = new Scanner(System.in);
    static boolean loop = true;

    public static void main(String[] args) {

        while (loop) {
            menu();
        }
    }

    public static void menu() {

        System.out.println("1.Add");
        System.out.println("2.Remove");
        System.out.println("3.Update");
        System.out.println("4.ShowAll");
        System.out.println("5.ShowOne");
        System.out.println("0.Exit");

        System.out.print("Make a choice:");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                StudentManagement.addStudent();
                break;
            case 2:
                System.out.print("What is the id of the student to be removed?");
                int id = Arrays2.sc.nextInt();
                sc.nextLine();

                StudentManagement.removeStudentById(id);

                break;
            case 3:
                System.out.print("What is the id of the student to be updated?");
                id = Arrays2.sc.nextInt();
                sc.nextLine();
                StudentManagement.updateStudent(id);
                break;
           
            case 4:
                StudentManagement.showAllStudents();
                break;
            case 5:
                System.out.print("What is the id of the student to be shown?");
                id = Arrays2.sc.nextInt();
                sc.nextLine();
                StudentManagement.showStudentByID(id);
                
                break;
            case 0:
                loop = false;
                break;

        }

    }

}

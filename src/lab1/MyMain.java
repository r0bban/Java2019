package lab1;

import static operations.RunRightAngledTriangle.*;
import static operations.RunCircle.*;
import static operations.RunRectangle.*;
import java.util.Scanner;

public class MyMain {

    static boolean loop = true;
    static public Scanner sc2 = new Scanner(System.in);

    public static void main(String[] args) {
//        boolean loop = true;
        while (loop) {

            System.out.println("\nPlease tell me which figure you want to calculate!");

            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Right-angled triangle");
            System.out.print("\nMake a choice:");

            int choice = sc2.nextInt();
            sc2.nextLine();

            switch (choice) {

                case 1:
                    RunCircle();
                    break;
                case 2:
                    RunRectangle();
                    break;
                case 3:
                    RunRightAngledTriangle();
                    break;

                default:
                    System.out.println("Felaktig inmatning");
            }

            System.out.println("\nDo you want to calculate a new figure? (yes/no)");
            String choice2 = sc2.nextLine();

            switch (choice2) {
                case "yes":
                    break;
                case "no":
                    System.out.println("\nOk, bye bye ;)");
                    loop = false;
                    break;
                default:
                    System.out.println("Felaktig inmatning");
                    break;
            }

        }

    }

}

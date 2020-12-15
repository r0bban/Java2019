package exercisew35;

import java.util.Scanner;

public class Stars2 {

    static int count;

    public static void main(String[] args) {

        boolean loop = true;
        while (loop) {

            count = count + 1;

            System.out.println("How many stars do you want to print?");
            Scanner sc = new Scanner(System.in);
            int starsAmount = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < starsAmount; i++) {
                System.out.print("*");
            }

            System.out.println();

            System.out.println("Do you want to print more stars? (yes/no)");
            String response = sc.nextLine();
            switch (response) {
                case "yes":
//(funkar utan)     loop = true;
                    break;
                case "no":
                    loop = false;
                    System.out.println("You printed " + count + " times.");
                    break;
                default:
                    System.out.println("Felaktig inmatning. Programmet avslutas.");
                    System.out.println("You printed " + count + " times.");
                    loop = false;
            }
        }

    }

}

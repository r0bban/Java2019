package exercisew35;

import java.util.Scanner;

public class Stars {

    public static void main(String[] args) {
        System.out.println("How many stars do you want to print?");
        Scanner sc = new Scanner(System.in);
        int starsAmount = sc.nextInt();

        for (int i = 0; i < starsAmount; i++) {
            System.out.print("*");
        }
        System.out.println();

    }

}

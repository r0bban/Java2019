package calculator2;

import static calculator2.Calculations.*;
//import static calculator2.CalculationsTest.*;
import java.util.Scanner;

public class Calculator2 {

    static Scanner sc = new Scanner(System.in);
    static double num1;
    static double num2;
    static boolean loop = true;

    public static void main(String[] args) {
        while (loop) {
            System.out.print("Ange tal 1: ");
            num1 = sc.nextDouble();
            System.out.print("Ange tal 2: ");
            num2 = sc.nextDouble();

            menu();
        }
    }

    static void menu() {

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Devide");
        System.out.println("0. Exit");
        System.out.println("\nMake a choice:");

        int val = sc.nextInt();

        if (val == 1) {
            double result = add(num1, num2);
            System.out.println(num1 + "+" + num2 + " = " + result);
        } else if (val == 2) {
            double result = subtract(num1, num2);
            System.out.println(num1 + "-" + num2 + " = " + result);
        } else if (val == 3) {
            double result = multiply(num1, num2);
            System.out.println(num1 + "*" + num2 + " = " + result);
        } else if (val == 4) {
            double result = devide(num1, num2);
            System.out.println(num1 + "/" + num2 + " = " + result);
        } else if (val == 0) {
            loop = false;
        } else {
            System.out.println("Felaktig inmatning");
        }

    }



}

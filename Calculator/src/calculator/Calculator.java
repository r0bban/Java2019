package calculator;

import java.util.Scanner;
import static calculator.Calculations.*;

public class Calculator {

    public static void main(String[] args) {
        do {
        Scanner sc = new Scanner(System.in);
        System.out.print("Select add, sub, devide or multiply: ");
        String option = sc.next();
        switch(option) {
            case "add":
                System.out.print("Ange tal 1: ");
                double num1 = sc.nextDouble();
                System.out.print("Ange tal 2: ");
                double num2 = sc.nextDouble();

                double sum1 = add(num1, num2);
                System.out.println("Summan är: " + sum1);
                break;
            case "sub":
                System.out.print("Ange tal 1: ");
                double subNum1 = sc.nextDouble();
                System.out.print("Ange tal 2: ");
                double subNum2 = sc.nextDouble();

                double sum2 = sub(subNum1, subNum2);
                System.out.println("Summan är: " + sum2);
                break;
            case "devide":
                System.out.print("Ange tal 1: ");
                double devideNum1 = sc.nextDouble();
                System.out.print("Ange tal 2: ");
                double devideNum2 = sc.nextDouble();

                double sum3 = devide(devideNum1, devideNum2);
                System.out.println("Summan är: " + sum3);
                break;
            case "multiply":
                System.out.print("Ange tal 1: ");
                double multiplyNum1 = sc.nextDouble();
                System.out.print("Ange tal 2: ");
                double multiplyNum2 = sc.nextDouble();

                double sum4 = multiply(multiplyNum1, multiplyNum2);
                System.out.println("Summan är: " + sum4);
                break;
        }
        } while (true);
    }


/* Simpel calc
        Scanner sc = new Scanner(System.in);

        System.out.print("Ange tal 1: ");
        double num1 = sc.nextDouble();
        System.out.print("Ange tal 2: ");
        double num2 = sc.nextDouble();

        double sum = add(num1, num2);
        System.out.println("Summan är: " + sum);

    }

    static double add(double number1, double number2) {

        return number1 + number2;
*/

}

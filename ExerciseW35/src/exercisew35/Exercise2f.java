package exercisew35;

import java.util.Scanner;

public class Exercise2f {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please provide number 1: ");
        double d1 = sc.nextDouble();
        System.out.print("Please provide number 2: ");
        double d2 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Choose add, sub, multiply or div: ");
        String mathType = sc.nextLine();

        switch (mathType) {
            case "add":
                System.out.println(d1 + " + " + d2 + "= " + Calculations.add(d1, d2));
                break;
            case "sub":
                System.out.println(d1 + " - " + d2 + "= " + Calculations.sub(d1, d2));
                break;
            case "multiply":
                System.out.println(d1 + " * " + d2 + "= " + Calculations.multiply(d1, d2));
                break;
            case "div":
                System.out.println(d1 + " / " + d2 + "= " + Calculations.div(d1, d2));
                break;
            default:
                System.out.println("Felaktigt val. Program avslutas");
                break;
        }

    }

}

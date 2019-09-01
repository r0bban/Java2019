package operations;

import UI.UI;
import shapes.RightAngledTriangle;
import java.util.Scanner;
import static lab1.MyMain.sc2;

public class RunRightAngledTriangle {

//    static Scanner sc = new Scanner(System.in);

    public static void RunRightAngledTriangle() {
        System.out.println("Right-angled triangle, excelent choice :) Please provide base and height!");
//        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        double base = sc2.nextDouble();
        System.out.print("Height: ");
        double height = sc2.nextDouble();

        RightAngledTriangle t = new RightAngledTriangle(base, height);
        
        int choice = UI.ChooseCalculation();

        switch (choice) {
            case 1:
                System.out.println(t.printArea());
                break;
            case 2:
                System.out.println(t.printPerimeter());
                break;
            case 3:
                System.out.println(t.printArea());
                System.out.println(t.printPerimeter());
                break;
            default:
                System.out.println("Felaktig inmatning");
                break;
        }

    }



}

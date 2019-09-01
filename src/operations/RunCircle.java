package operations;

import UI.UI;
import shapes.Circle;
//import java.util.Scanner;
import static lab1.MyMain.sc2;

public class RunCircle {

//    static Scanner sc = new Scanner(System.in);

    public static void RunCircle() {
        System.out.println("A circle, excelent choice :) Please provide the radius!");
//        Scanner sc = new Scanner(System.in);

        System.out.print("Radius: ");
        double radius = sc2.nextDouble();

        Circle t = new Circle(radius);

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
        }

    }

}

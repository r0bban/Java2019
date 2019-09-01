package operations;

import UI.UI;
import shapes.Rectangle;
import java.util.Scanner;
import static lab1.MyMain.sc2;

public class RunRectangle {

//    static Scanner sc = new Scanner(System.in);

    public static void RunRectangle() {
        System.out.println("Rectangle, excelent choice :) Please provide width and height!");
//        Scanner sc = new Scanner(System.in);

        System.out.print("Width: ");
        double width = sc2.nextDouble();
        System.out.print("Height: ");
        double height = sc2.nextDouble();

        Rectangle t = new Rectangle(width, height);

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

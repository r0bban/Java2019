/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import lab1.MyMain;

/**
 *
 * @author rober
 */
public class UI {

    public static int ChooseCalculation() {
        System.out.println("\n2Thank you, please tell me what you want to calculate!");
        System.out.println("1. Area");
        System.out.println("2. Perimeter");
        System.out.println("3. Both");
        System.out.print("\nMake a choice:");
        int choice = MyMain.sc2.nextInt();
        MyMain.sc2.nextLine();
        return choice;
    }
}

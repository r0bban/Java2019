package UI;

public class UI {

    public static int menu() {
        System.out.println("\n2Thank you, please tell me what you want to calculate!");
        System.out.println("1. Area");
        System.out.println("2. Perimeter");
        System.out.println("3. Both");
        System.out.print("\nMake a choice:");
        int choice = SimpleArray.sc.nextInt();
        SimpleArray.sc.nextLine();
        return choice;
    }

}

package arrays;

import java.util.Scanner;

public class Arrays {
    
    //static Student[] students = new Student[30];
    
    static int[] talen = new int[30];
    public static int nextFreePosition = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        loadDb();
        
        addNumber();
        addNumber();
        printAll();
        
    }

    public static void printAll() {
        for (int i = 0; i < nextFreePosition; i++) {
            System.out.println(talen[i]);
        }
    }

    public static void addNumber() {
        System.out.print("Number to add: ");
        int tal = sc.nextInt();
        sc.nextLine();
        talen[nextFreePosition] = tal;
        nextFreePosition++;
        
        if (talen.length==nextFreePosition) {
            int[] talen2= new int[talen.length*3];
            
            for (int i = 0; i < talen.length; i++) {
                talen2[i]= talen[i];
            }
            
            talen = talen2;
        }
    }

    public static void removeNumber() {
        System.out.print("Which positions do you want to delete?");
        int pos = sc.nextInt();
        sc.nextLine();

        if (pos == (nextFreePosition - 1)) {
            talen[pos] = 0;
            nextFreePosition--;

        } else {
            talen[pos] = talen[nextFreePosition - 1];
            talen[nextFreePosition - 1] = 0;
            nextFreePosition--;
        }

    }
    
//    public static void loadDb() { }

}

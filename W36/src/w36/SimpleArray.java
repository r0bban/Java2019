package w36;

import java.util.Scanner;

public class SimpleArray {

    static Scanner sc = new Scanner(System.in);
    static int counter;
    static int[] myList;
    
    public static void main(String[] args) {

        System.out.println("Hur mångs tal vill du skapa en lista för?");

        int listaLength = sc.nextInt();

        int[] lista = new int[listaLength];

        System.out.println("Mata in " + lista.length + " tal");

        for (int i = 0; i < lista.length; i++) {
            lista[i] = sc.nextInt();
        }

        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + (", "));
        }
        
        counter = lista.length;
        
    }

    public void add() {
        
        System.out.println("Vilket värde ta vill du lägga till?");
        int addedValue;
        addedValue = sc.nextInt();
        
               
        if (counter) {
            
        }
        

        int[] lista2 = new int[listLenght++];
        
        for (int i = 0; i < lista2.length; i++) {
            lista2[i] = myList[i];
                        
        }

    }

}

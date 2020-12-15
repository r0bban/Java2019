package exercisew35;
import java.util.Scanner;

public class Exercise2b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please provide number 1: ");
        double d1 = sc.nextDouble();
        System.out.print("Please provide number 2: ");
        double d2 = sc.nextDouble();
        
        double sum1 = d1 + d2;
        System.out.println(sum1);

    }

}

package exercisew35;

public class VVPWhile {
    public static void main(String[] args) {
        int [] myArray = {12,30,34,85,4,54,22,19,11,84};
        
        int numberUsed = 0;
        int total = 0;
        while (total<100) {
            total += myArray[numberUsed];
            numberUsed++;
        }
        System.out.println("Total :" + total);
        System.out.println("Number used: " + numberUsed);

    }
}

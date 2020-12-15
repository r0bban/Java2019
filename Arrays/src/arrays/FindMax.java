package arrays;

public class FindMax {

    public static void main(String[] args) {

        double summa;
        //här anropar jag icke-void metoden "findMAx" som returnerar ett väre samtidigt som den har en println
        //det fungerar att använda i prod för att få värde i retur, men det är inte bra att printa i onödan.
        summa = 10 + (findMax(56, 89, 23)); 
        System.out.println(summa);
        
        
        findMax(56, 89, 23); 

        
        findMin(56, 89, 23);

        
        
    }

    static double findMin(double x, double y, double z) {

        double min = x;
        if (y < min) {
            min = y;
        }
        if (z < min) {
            min = z;
        }
        System.out.println("Minsta värdet är: " + min);

        return min;
    }

    //Enkel metod för att hitta Max när du vet antal positioner i Array.
    //Fungerar INTE om du INTE vet antal eftersom det måste finnas en If för varje tal.
    static double findMax(double x, double y, double z) {
        double max = x;

        if (y > max) {
            max = y;
        }

        if (z > max) {
            max = z;
        }
        System.out.println("Max är:" + max);
        return max;

    }

}

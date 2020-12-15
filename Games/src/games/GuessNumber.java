package games;

import javax.swing.JOptionPane;

public class GuessNumber {

    public static void main(String[] args) {

        int randomInt = RandomGenerator.RandomIntZeroToX(1000);

//        System.out.println(randomInt);

        String guessString = JOptionPane.showInputDialog("Gissa ett tal mellan 1 och 1000");
        int guess = Integer.parseInt(guessString);

        while (guess != randomInt) {
            if (guess < randomInt) {
                guessString = JOptionPane.showInputDialog("Gissa igen. Tips: Talet är STÖRRE än " + guess);
                guess = Integer.parseInt(guessString);
            } else if (guess > randomInt) {
                guessString = JOptionPane.showInputDialog("Gissa igen. Tips: Talet är MINDRE än " + guess);
                guess = Integer.parseInt(guessString);
            }
        }
        System.out.println("Grattis, du gissade rätt!!!");

    }



}

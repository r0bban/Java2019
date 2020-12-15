/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games;

/**
 *
 * @author rober
 */
public class RandomGenerator {
    
    public static int RandomIntZeroToX(int x) {
    double randomDouble = Math.random();
    randomDouble = randomDouble * x + 1;
    int randomInt = (int) randomDouble;
    return randomInt;
    }
    
}

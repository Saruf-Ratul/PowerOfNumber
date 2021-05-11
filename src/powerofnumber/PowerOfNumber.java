/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package powerofnumber;

/**
 *
 * @author Saruf
 */
public class PowerOfNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int base = 2, exponent = 2;

        long result = 1;

        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println("Answer = " + result);
    }
    
}

package com.varnan;

import java.util.Scanner;

/**
 * @author Varnan Goenka
 * date 29/04/2024
 * A program to check if a number is odd, even, and prime.
 */

public class NumberStats {
    /**
     * Main method
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Please enter a number:");
        int number = input.nextInt();
        MyNumber myNumber = new MyNumber(number);
        
        // Display the results of various checks on the number
        System.out.println("The number is even: " + myNumber.isEven());
        System.out.println("The number is odd: " + myNumber.isOdd());
        System.out.println("The number is prime: " + myNumber.isPrime());
    }
}

/**
 * A class that represents a number and provides methods to check its properties.
 */
class MyNumber {
    private int val;
    
    /**
     * Constructor to initialize the number.
     * @param val The value of the number.
     */
    public MyNumber(int val) {
        this.val = val;
    }
    
    /**
     * Returns the value of the number.
     * @return The value of the number.
     */
    public int getVal() {
        return val;
    }
    
    /**
     * Checks if the number is odd.
     * @return true if the number is odd, otherwise false.
     */
    public boolean isOdd() {
        return val % 2 != 0;
    }
    
    /**
     * Checks if the number is even.
     * @return true if the number is even, otherwise false.
     */
    public boolean isEven() {
        return val % 2 == 0;
    }
    
    /**
     * Checks if the number is prime.
     * @return true if the number is prime, otherwise false.
     */
    public boolean isPrime() {
        if (val <= 1) {
            return false;
        }
        for (int i = 2; i < val; i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }
}

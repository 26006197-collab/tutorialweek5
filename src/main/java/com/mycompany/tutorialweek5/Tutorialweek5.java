/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tutorialweek5;

/**
 *
 * @author User
 */
import java.util.Random;
public class Tutorialweek5 {

    public static void main(String[] args) {
     
        
        // a. Find the largest integer n so that n^3 is less than 2000.
        int n = 1;
        while (Math.pow(n + 1, 3) < 2000) {
            n++;
        }
        System.out.println("a. Largest integer n: " + n);

        // b. Display the square number of the first twelve integers starting from 1.
        System.out.print("b. Squares: ");
        for (int i = 1; i <= 12; i++) {
            System.out.print((i * i) + " ");
        }
        System.out.println();

        // c. Display a 4-by-5 matrix using random number within 0 to 100.
        System.out.println("c. 4-by-5 Matrix:");
        Random rand = new Random();
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                // rand.nextInt(101) generates numbers from 0 to 100 inclusive
                System.out.printf("%4d", rand.nextInt(101));
            }
            System.out.println();
        }

        // d. Compute the sum of numbers from 1 to a given number.
        int givenNumber = 50; // Example given number
        int sumD = 0;
        for (int i = 1; i <= givenNumber; i++) {
            sumD += i;
        }
        System.out.println("d. Sum from 1 to " + givenNumber + ": " + sumD);

        // e. Compute the sum of the series: 1/25 + 2/24 + 3/23 ... + 25/1 in two decimal places.
        double sumE = 0.0;
        for (int i = 1; i <= 25; i++) {
            sumE += (double) i / (26 - i);
        }
        System.out.printf("e. Sum of the series: %.2f\n", sumE);
    }
}

    


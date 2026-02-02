/**
 * Reed Lowry
 * Tests.java
 * This program calculates and prints the average of three test scores.
 * 02-01-2026
 */

public class Tests {
    public static void main(String[] args) {
        double test1 = 88.0;
        double test2 = 78.9;
        double test3 = 97.6;
        double average = (test1 + test2 + test3) / 3;

        System.out.println("Test score 1:   " + test1);
        System.out.println("Test score 2:  " + test2);
        System.out.println("Test score 3:  " + test3);
        System.out.println("The average of 3 test scores is:  " + average);
    }
}
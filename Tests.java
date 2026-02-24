/**
 * This class calculates the average of test scores entered by the user.
 * The user can enter as many test scores as they like, and the program will calculate the average when the user is finished.
 * Reed Lowry
 * 02/23/2026
 * Tests.java
 */
import java.util.Scanner;

public class Tests {
   private double ave;
   private int count;
   private int score;

   public Tests() {
      ave = 0.0;
      count = 0;
      score = 0;
   }

   public void getAverage() {
      Scanner scnr = new Scanner(System.in);
      int sum = 0;
      System.out.println("Enter test scores (-1 to quit):");
      score = scnr.nextInt();
      while (score != -1) {
         sum += score;
         count++;
         System.out.println("Enter test scores (-1 to quit):");
         score = scnr.nextInt();
      }
      ave = (double) sum / count;
   }

   public double getAve() {
      return ave;
   }

   public int getCount() {
      return count;
   }

   public int getScore() {
      return score;
   }

   public void setScore(int newScore) {
      score = newScore;
   }

   public String toString() {
      return String.format("The average of the %d scores entered is %.2f.", count, ave);
   }
}
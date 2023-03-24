///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           descriptive title of the program making use of this file
// Course:          Comp Sci 200 Lec 001, Spring, 2023
//
// Author:          Gavin Harwood
// Email:           gharwood @wisc.edu email address
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// 
// N/A
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////


import java.util.Scanner;

/**
 * The behavior of this code is likely different in Eclipse or IntelliJ as compared to zyBooks.
 * Refactor the code so that it works in both zyBooks and Eclipse or IntelliJ.
 *
 * @author mrenault, Yanan, mppowers, skrishnamoo
 */
public class IDEvsZyBooks {

     /**
     * Returns whether num1 and num2 are essentially not equal. NOT Equal means that the
     * absolute value of the difference between num1 and num2 is greater than or equal to
     * epsilon.
     * @param num1 a number to compare
     * @param num2 another number to compare
     * @param epsilon a threshold value, such that differences less than this number
     * are considered insignificant.
     * @return whether the numbers are considered not equal.
     */
    public static boolean areNotEqual(double num1, double num2, double epsilon) {
        return Math.abs(num1 - num2) >= epsilon;
    }

    /** This method reads a double value from the scanner.
     * @return a double value read from the scanner.
     */
    public static double readDouble() {
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    /**
     * This program reads in two numbers. If their difference is less than a threshold value
          * the numbers are considered equal otherwise they are not equal.
     * @param args unused
     */
    public static void main(String[] args) {
        final double SIGNIFICANT_THRESHOLD = 0.1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 floating point numbers: ");
        double firstNum = input.nextDouble();
        double secondNum = input.nextDouble();
        //double firstNum = readDouble();
        //double secondNum = readDouble();
        System.out.println("The values you entered are: " + firstNum + " and " + secondNum);

        if ( areNotEqual(firstNum, secondNum, SIGNIFICANT_THRESHOLD)) {
            System.out.println("The numbers are not considered equal.");
        } else {
            System.out.println("The numbers are considered equal.");
        }
    }
}
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
/*
 * Rectangles main method takes in 8 values from user and parses them into 
 * integers to be passed into the firstRectangleSmallest method
 * 
 */
public class Rectangles {
      
    /** Reads in the coordinates of two rectangles and prints out
     * whether the first is smaller than the second.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r1UpperLeftX;
        int r1UpperLeftY;
        int r1BottomRightX;
        int r1BottomRightY;
        int r2UpperLeftX;
        int r2UpperLeftY;
        int r2BottomRightX;
        int r2BottomRightY;

        r1UpperLeftX = input.nextInt();
        r1UpperLeftY = input.nextInt();
        r1BottomRightX = input.nextInt();
        r1BottomRightY = input.nextInt();
        r2UpperLeftX = input.nextInt();
        r2UpperLeftY = input.nextInt();
        r2BottomRightX = input.nextInt();
        r2BottomRightY = input.nextInt();

        System.out.println(firstRectangleSmallest(r1UpperLeftX, r1UpperLeftY, r1BottomRightX,
                r1BottomRightY, r2UpperLeftX, r2UpperLeftY, r2BottomRightX, r2BottomRightY));
    }
/*
 * 
 * firstRectangleSmallest method returns a boolean for whether or not
 * the first rectangle's area is smaller than the second rectangle
 * 
 */
    public static boolean firstRectangleSmallest(int r1UpperLeftX, int r1UpperLeftY, int r1BottomRightX,
    int r1BottomRightY, int r2UpperLeftX, int r2UpperLeftY, int r2BottomRightX, int r2BottomRightY) {
        
        int r1Area = (r1UpperLeftX - r1BottomRightX) * (r1UpperLeftY - r1BottomRightY);
        int r2Area = (r2UpperLeftX - r2BottomRightX) * (r2UpperLeftY - r2BottomRightY);
        
        if (r2Area > r1Area) {
            return true;
        } else {
            return false;
        }

    }


}

///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           HelloIDE Method asks user what their name is, saves their
//                  input as a name, and greets them. If there is no input then
//                  method simply greets them as visitor.
// Course:          CompSci 200 Lecture 001, Spring, 2023
//
// Author:          Gavin Harwood
// Email:           gharwood@wisc.edu email address
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// N/A
// 
// 
//         
// 
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Scanner;
/**
 * HelloIDE public class contains the Main method; it reads in user input as a 
 * name and outputs a greeting
 * that includes the name or greets them as visitor
 */
public class HelloIDE {

/**
 * Main method parameter is String args, it scans in user input and greets them
 * with the string they input or if no input just as 'visitor'
 * @param args input String from the user
 */
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        System.out.println("What is your name? ");
        
        final String DEFUALT_NAME = "visitor";
        
        if (scnr.hasNextLine()) {
            String name = scnr.nextLine();

            //if (name.trim().isEmpty()) {
            if (name.trim().isEmpty()) {
              //if (name.length() > 0) {
                System.out.println("Hello, " + DEFUALT_NAME + "!");
            } else { 
                System.out.println("Hello, " + name.trim() + "!");
            }
        
        } else {
            System.out.println("Hello, " + DEFUALT_NAME + "!");
        }
    


    }
}

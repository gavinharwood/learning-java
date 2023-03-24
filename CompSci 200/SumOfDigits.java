///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           descriptive title of the program making use of this file
// Course:          Comp Sci 200 Lec 001, Spring, 2023
//
// Author:          Gavin Harwood
// Email:           gharwood@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient
// 
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////


import java.util.Scanner;

/**
*Sum of digits class takes in a string from user; if string of integers it adds
*each one to the sum, if not a string of integers then it prints out invalid
*number

*/
public class SumOfDigits {



/**main method takes in user string, checks to see if it contains only ints 
*and parses it into the sum method if so to calcualte sum
*calculate sum
* @param args not used in program
* @param input scanner object that takes in user string
*/
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        boolean temp = input.hasNextInt();
        
        if (temp) {
            String userInput = input.next();
            String tempVal = sum(userInput);
            System.out.println(tempVal);

        } else {

            System.out.println("Invalid number.");
        }
        input.close();
    }
   

/**
*sum method calculates the sum of each integer inside of user string
* @param userInput the user string from scanner
* @return String that contains the sum of parsed integers
*/
    public static String sum(String userInput) {
        
        int i;
        int sum = 0;
        
        for (i = 0 ; i < userInput.length() ; i++) {
            
            sum += (userInput.charAt(i) - '0');
        }
        return "The sum of all digits is: " + sum;
    
       
        }
        
    }


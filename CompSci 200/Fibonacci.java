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
// Source or Recipient;
// N/A
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////


import java.util.Scanner;


/**
 * Fibonacci class takes in input from user and calculates the sum of that many
 * numbers in the fibonacci sequence
 * 
 */
public class Fibonacci{


/**
 * main method takes in user input and uses a for loop to sum that number of terms
 * in the fiboncacci sequence
 * @param args unused
 * @param userNum the input from the user
 * @param scnr the scanner object used to read from terminal
 * @return is unsuded, main method is void
 */


    public static void main(String[] args){
        
        Scanner scnr = new Scanner(System.in);
		int userNum = 0;
		int lowBound = 1;
		int highBound = 40;
		int sumOfFibonacci = 1;
		boolean validUserNum = false;
		
		String prompt = "Please enter a number between " + lowBound + " and " 
		      + highBound + " (inclusive): ";
		String outOfBounds = "You have entered a number that is out of bounds. ";
      
      /* Add your code here */
        String n;
	    System.out.println(prompt);
        validUserNum = scnr.hasNextInt();

	    if (!validUserNum) {
            while (!validUserNum) {
                System.out.println(prompt);
                validUserNum = scnr.hasNextInt();
                n = scnr.next();
                if (validUserNum) {
                    userNum = Integer.parseInt(n);
                    
                }
            }

        }

        if (!((lowBound < userNum) && (userNum < highBound))) {
            
            do {
                validUserNum = scnr.hasNextInt();
                n = scnr.next();
                if (validUserNum) {
                    userNum = Integer.parseInt(n);
                    break;
                }
                System.out.print(outOfBounds);
                System.out.println(prompt);
            } while (!((userNum > lowBound) && (userNum < highBound))); 
        }
        

	    int j = 1;
        int f = 1;	
        for (int i = 0; i < userNum; i++) {
		    f = sumOfFibonacci;
		    sumOfFibonacci = f + j;
		    j = f;
	    }
	  
        /* End of your code */
      
        System.out.print("The sum of the first " + userNum + 
            " numbers in the Fibonacci Sequence is " + (sumOfFibonacci - 1));
	
		scnr.close();
		return;
    }
    
}
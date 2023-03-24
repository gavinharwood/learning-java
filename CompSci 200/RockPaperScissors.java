///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           descriptive title of the program making use of this file
// Course:          Comp Sci 200 Lec 001, Spring, 2023
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
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Scanner;
import java.util.Random;

//replace with a class header comment following the Style Guide
public class RockPaperScissors {
   
   //replace with a method header comment following the Style Guide
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      Random randGen = new Random(Config.SEED);
      System.out.println("Please select one of [R/P/S]: ");
      char userInput = keyboard.next();
      String tempVal1;
      String tempVal2;
      if (! ((userInput.equals("r") || userInput.equals("R") || userInput.equals("p") || userInput.equals("P") || userInput.equals("s") || userInput.equals("S")))) {
            System.out.print(" Invalid choice! Defualting to Rock.");
            tempVal2 = "Rock";
         }
      if (userInput.equals("r") || userInput.equals("R")) {
        tempVal1 = "Rock";
      } else if (userInput.equals("p") || userInput.equals("P")) {
        tempVal1 = "Paper";
      } else {
        tempVal1 = "Scissors";
      }

      
      int var1 = randGen.nextInt(3) + 1;
      if (var1 == 1) {
        tempVal2 = "Rock";
      } else if (var1 == 2) {
        tempVal2 = "Paper";
      } else {
        tempVal2 = "Scissors";
      }

      if ((tempVal1.equals("Rock") && tempVal1.equals(tempVal2)) {
        System.out.println("A tie!");
      }
      if ((tempVal1.equals("Paper") && tempVal1.equals(tempVal2)) {
        System.out.println("A tie!");
      }
      if ((tempVal1.equals("Scissors") && tempVal1.equals(tempVal2)) {
        System.out.println("A tie!");
      }
      if ((tempVal1.equals("Rock") && tempVal1.equals("Paper")) {
        System.out.println("I chose: Paper")
        System.out.println("Paper beats rock - you lose!")
      }
      if ((tempVal1.equals("Rock") && tempVal1.equals("Scissors")) {
        System.out.println("I chose: Scissors")
        System.out.println("Rock beats scissors - you win!")
      }
      if ((tempVal1.equals("Paper") && tempVal1.equals("Rock")) {
        System.out.println("I chose: Rock")
        System.out.println("Paper beats rock - you win!")
      }
      if ((tempVal1.equals("Paper") && tempVal1.equals("Scissors")) {
        System.out.println("I chose: Scissors")
        System.out.println("Scissors beats paper - you lose!")
      }
      if ((tempVal1.equals("Scissors") && tempVal1.equals("Paper")) {
        System.out.println("I chose: Paper")
        System.out.println("Scissors beats paper - you win!")
      }
      if ((tempVal1.equals("Scissors") && tempVal1.equals("Rock")) {
        System.out.println("I chose: Rock")
        System.out.println("Rock beats scissors - you lose!")
      }
   }
}
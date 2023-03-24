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

// replace this with a class header comment following the Style Guide
public class UserAge {
   
   // replace this with a method header comment following the Style Guide
   public static int getAgeInMonths(int birthMonth, int birthDay, int birthYear, int currMonth, int currDay, int currYear) { 
      
      int tempVal1 = (currYear - birthYear) * 12;
      int tempVal2;
      if (currMonth <= birthMonth) {
         tempVal2 = currMonth - birthMonth;
         tempVal1 += tempVal2;
      } else {
         tempVal2 = birthMonth - currMonth;
         tempVal1 -= tempVal2;
      }
      if (birthDay - currDay == 29) {
        tempVal1 -= 1;
      }
      //if (birthDay - currDay ) 
      
      return tempVal1;
   } 
   
   //replace this with a method header comment following the Style Guide
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int birthMonth;
      int birthDay;
      int birthYear; 
      int currMonth;
      int currDay;
      int currYear; 
      
      birthMonth = scnr.nextInt(); 
      birthDay = scnr.nextInt(); 
      birthYear = scnr.nextInt(); 
      currMonth = scnr.nextInt(); 
      currDay = scnr.nextInt(); 
      currYear = scnr.nextInt(); 
      
      System.out.println(getAgeInMonths(birthMonth, birthDay, birthYear, currMonth, currDay, currYear)); 
   }
}

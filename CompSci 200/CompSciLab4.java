///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           descriptive title of the program making use of this file
// Course:          course number, term, and year
//
// Author:          your name
// Email:           your @wisc.edu email address
// Lecturer's Name: name of your lecturer
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// Examples:
// Jane Doe; helped me with for loop in reverse method
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html; 
//         counting for loop
// John Doe; I helped with switch statement in main method.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////


import java.util.Scanner;
public class CompSciLab4 {

    public static void main(String[] args) {

        Scanner z = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int num = z.nextInt();
        System.out.println("Grade: " + grader(num));


}
    public static String grader(int t) {

        String grades;		
        if (t >= 93) {
            grades = "A";
        }
        else if (t >= 89) {		
            grades = "AB";
        }
        else if (t >= 82) {			
            grades = "B";
        }	
        else if (t >= 76) {		
            grades = "BC";
        }
        else if (t >= 68) {		
            grades = "C";    
        }                
        else if (t >= 55) {			
            grades = "D";
        }
        else {
            grades = "F";
        }		
    
        return grades; 	

}
    
       
        



    





}










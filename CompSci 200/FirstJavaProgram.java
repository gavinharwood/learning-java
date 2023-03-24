import java.util.Scanner;
import java.util.Random;

public class FirstJavaProgram {
    public static void main(String[] args) {
        System.out.println("Hello World");
        double fraction = (double) 5 / 10;
        System.out.println(fraction);

        // Comp Sci Lab 2 example    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of one side of a cube ");
        double sideLength = input.nextDouble();
        double area = sideLength * sideLength * 6.0;
        System.out.println("Cube has surface area: " + area);

        // Comp Sci Lab 2 example
        Scanner squareSideLength = new Scanner(System.in);
        System.out.println("Enter the side length of the sqaure: ");
        double sideLength2 = squareSideLength.nextDouble();
        double radius = Math.pow(sideLength2, 2.0);
        double squareArea = sideLength2 * sideLength2;
        double circleArea = Math.PI * (radius * radius);
        double unusedPaint = squareArea - circleArea;
        System.out.println("The area of the square is " + squareArea);
        System.out.println("The area of the circle is " + circleArea);
        System.out.println("The area of the unused parts of the square are: " + unusedPaint);


        // Comp Sci Lec Ex:
        Scanner inputNum = new Scanner(System.in);
        int value = inputNum.nextInt();

        int tempVal2 = add3(value);
        System.out.println(tempVal2);
    }

    public static int add3(int num) {

        int tempVal = num + 3;
        return tempVal;
    }

    
    
// functions read next token or series of non white space characters
// next() returns a string
// nextInt() trys to return value as an int
// nextDouble() trys to return value as a double
//next() returns everything on a line as a string including spaces, stops at the next new line
        



    
}

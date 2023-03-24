import java.util.Scanner;
import java.util.Random;

/* public class CompSciLab3 {
public static void main(String[] args) {
    System.out.println("hello");


    Random randGen = new Random();

    double newVar = randGen.nextInt(2) - 0.5;
    System.out.println(newVar);

    String var2 = "HelloWorld.java";


    if (var2.contains(".java")) {
        System.out.println("yes");
    }

    String word = "basketball";
    System.out.println(word.indexOf("5"));
}

}
 */


 public class CompSciLab3 {
	
	public static double BMI(double heightMeters, double weightKilos) {
		double bmi = -1; //implement BMI equation
		return bmi;
	}
	
	public static void testBMI() {
		System.out.println( "bmi(1.778, 79.5)=" + weightAndMeters(1.778, 79.5) + " should be ~25");
		System.out.println( "bmi(1.828, 54.5)=" + weightAndMeters(1.828, 54.5) + " should be ~16");
		//what additional cases can you find or create? 
	}
	
	public static double inchesToMeters( double inches) {
		
		return -1; //implement equation using constant
	}
	
	public static void testInchesToMeters() {
		System.out.println("inchesToMeters(1)= " + inchesToMeters(1) + " should be 0.0254");
		System.out.println("inchesToMeters(12)= " + inchesToMeters(12) + " should be 0.3048");
		//add additional test cases
	}
	
	public static double feetToInches( double feet) {
		return -1; //implement equation using constant
	}
	
	public static void testFeetToInches() {
		System.out.println("feetToInches(1)= " + feetToInches(1) + " should be 12");
		//add additional test cases
	}
	
	public static double poundsToKilograms( double pounds) {
		return -1; //implement equation using constant
	}
	
	public static void testPoundsToKilograms() {
		System.out.println("poundsToKilograms(2.2)= " + poundsToKilograms(2.2) + " should be 1");
		System.out.println("poundsToKilograms(1)= " + poundsToKilograms(1) + " should be 0.453592");
		//add additional test cases
	}	





    public static double weightAndMeters(double meters, double weightKG) {
        double bmi = weightKG / (Math.pow(meters, 2));
        return bmi;

    }
	
    public static double inchesAndPounds(double pounds, double inches) {
        double meters = inches / 39.37;
        double weightKG = pounds / 2.205;
        double bmi = weightKG / (Math.pow(meters, 2));
        return bmi;
    }

    public static double feet(double feet, double inches, double pounds) {
        double newInches = feet / 12;
        double meters = (newInches + inches) / 39.37;
        double weightKG = pounds / 2.205;
		double bmi = weightKG / (Math.pow(meters, 2));
		return bmi;


    }
	public static void main(String[] args) {
		//	testBMI();
		//	testInchesToMeters();
		//	testFeetToInches();
		//	testPoundsToKilograms();
			    
				Scanner input = new Scanner( System.in);
			
			System.out.print("Height (meters): ");
			double heightMeters = input.nextDouble();
			
			System.out.print("Weight (kilograms): ");
			double weightKilos = input.nextDouble();
			
			double bmi = BMI( heightMeters, weightKilos);
			
			System.out.println("BMI: " + bmi);




            double meters = 1.6;
            double weightKG = 65;
            System.out.println(weightAndMeters(meters, weightKG));
			
            double pounds = 135;
            double inches = 67;
            System.out.println(inchesAndPounds(pounds, inches));

            inches = 10;
            double feet = 5;
            pounds = 135;

			//finish...
			
	}

}

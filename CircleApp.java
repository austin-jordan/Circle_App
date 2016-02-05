import java.util.Scanner;

public class CircleApp {
	
	public static void main(String[] args) {
		
	boolean running = true;
	boolean isValid;
	Scanner input = new Scanner(System.in);
	Circle circle1;
	do {
		System.out.println("Please enter the radius of the circle: ");
//		Validator validator1 = new Validator();
		double userRadius = Validator.getValidDoubleInRange(0, input);
		circle1 = new Circle(userRadius);
		System.out.println("The circumference of this circle is: " + circle1.getFormattedCircumference());
		System.out.println("The area of this circle is: " + circle1.getFormattedArea());
		System.out.println("Would you like to continue? (Yes or No, y/n)");
		String answer = Validator.isValidChoice(input);
		switch(answer) {
		case "Y": case "y": case "Yes": case "yes":
			break;
		case "N": case "n": case "No": case "no":
			running = false;
			break;
//		default: 
//			System.out.println("Please answer with y or n!");
//			input.next();
		}
	} while (running == true);
	System.out.println("Goodbye. You created " + circle1.getObjectCount() + " Circle objects");
	}
}

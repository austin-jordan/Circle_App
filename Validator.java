import java.util.Scanner;

public class Validator {

	// This method checks that the user inputs a valid integer. 
	public static int getValidInteger(Scanner input) {
		while(!input.hasNextInt()) {
			System.out.println("That's not a number! Please enter a number: ");
			input.nextLine();
		}
		int number = input.nextInt();
		return number;
	}
	//This method checks for a valid Double.
	public static double getValidDouble(Scanner input) {
		while(!input.hasNextDouble()) {
			System.out.println("That's not a double! Please enter a double: ");
			input.nextLine();
		}
		double number = input.nextDouble();
		input.nextLine();
		return number;
	}
	
	//This method checks that the user inputs a valid number in the range specified.
	public static double getValidDoubleInRange (double min, Scanner input) {
		min = 0;
		double number = getValidDouble(input);
		while(number < 0) {
			System.out.println("Please enter a number greater than " + min);
		number = getValidDouble(input);
		}
		return number;
	}
	//This method checks that user inputs either yes or no.
	public static String isValidChoice(Scanner input) {
		String inp = input.nextLine();
		while(!inp.matches("^[yY]es|[nN]o|[ynYN]$")) {
			System.out.println("That is not a valid option.");
//			System.out.println("Would you like to continue? (y/n): ");
			inp= input.nextLine();
		}
		return inp; 
	}
}

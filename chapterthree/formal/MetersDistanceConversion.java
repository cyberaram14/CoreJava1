import java.util.Scanner;

public class MetersDistanceConversion{
	
	// Conversion values as class constants
	static final double METERS_IN_YARD = 0.9144;
	static final int METERS_IN_KILOMETERS = 1000;
	static final int YARDS_IN_MILE = 1760;
	static final int FEET_IN_YARDS = 3;
	
	public static void main(String[] args){
		
		Scanner consoleInput = new Scanner(System.in);
		double distanceMeters;
		
		double distanceKilometers;
		double distanceYards;
		double distanceMiles;
		double distanceFeet;
		
		// Get user input for meters distance
		System.out.print("Please enter # of meters\n>> ");
		distanceMeters = consoleInput.nextDouble();
		
		// Calculate conversions
		distanceKilometers = distanceMeters / METERS_IN_KILOMETERS;
		distanceYards = distanceMeters / METERS_IN_YARD;
		distanceMiles = distanceYards / YARDS_IN_MILE;
		distanceFeet = distanceYards * FEET_IN_YARDS;
		
		System.out.println("\n\nMeters have been converted to the following distance units:");
		System.out.println("\nKilometers\n"		//Purely to demonstrate that statements can span multiple lines
							+ "Yards\n"
							+ "Miles\n"
							+ "Feet\n\n");
							
		// Output a formatted table into console
		
		/* TO BE CONTINUED */
		
	}
	
}
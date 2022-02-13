import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;

public class MetersDistanceConversion{
	
	// Conversion values as class constants
	static final double METERS_IN_YARD = 0.9144;
	static final int METERS_IN_KILOMETERS = 1000;
	static final int YARDS_IN_MILE = 1760;
	static final int FEET_IN_YARDS = 3;
	
	public static void main(String[] args) throws IOException{
		
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
		
		StringBuilder formattedTableContentBuilder = new StringBuilder();
		
		formattedTableContentBuilder.append(String.format("_%1$s_%<s_%<s_%<s_\n", "_______________"));
		formattedTableContentBuilder.append(String.format("|%15s|%15s|%15s|%15s|\n", "Kilometers", "Yards", "Miles", "Feet"));
		formattedTableContentBuilder.append(String.format("|%1$s+%<s+%<s+%<s|\n", "---------------"));
		formattedTableContentBuilder.append(String.format("|%15.5f|%15.5f|%15.5f|%15.5f|\n", distanceKilometers, distanceYards, distanceMiles, distanceFeet));
		formattedTableContentBuilder.append(String.format("-%1$s-%<s-%<s-%<s-", "---------------"));
		String formattedTableContent = formattedTableContentBuilder.toString();
		
		System.out.println("Table Summary of Conversion Calculations:");
		System.out.println(formattedTableContent);
		
		// Now save data to user accessible text file
		System.out.println("\n\nSaving conversions to file...");
		
		PrintWriter filePrintWriter = new PrintWriter("conversionchart.txt", StandardCharsets.UTF_8);
		filePrintWriter.println("Meters have been converted to the following distance units:");
		filePrintWriter.println("\nKilometers\n" + "Yards\n" + "Miles\n" + "Feet\n\n");
		filePrintWriter.printf("Converted: %.5f Meters equals:\n\n", distanceMeters);
		filePrintWriter.print(formattedTableContent + "\n\n");
		filePrintWriter.close();
		
		System.out.println("Conversion results saved in file \"conversionschart.txt\"");
		System.out.println("Come again!");
		System.out.println("\n=========END OF PROGRAM=========\n\n\n\n\n");
		
	}
	
}
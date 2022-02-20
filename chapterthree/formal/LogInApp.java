import java.util.Scanner;
import java.io.Console;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.io.IOException;

public class LogInApp
{

	public static void main(String[] args) throws IOException
	{
	
		Scanner consoleInput = new Scanner(System.in);
		Console console = System.console();
		String enteredUsername;
		char[] enteredPassword;
		boolean passwordVerified = false;
		boolean usernameVerified = false;
		boolean identityVerified = false;
		
		System.out.println("Welcome to our high security application");
		System.out.println("We have outlasted thousands of hacking attempts per day - you're in the best hands!\n\n");
		
		// Ask user for credentials
		System.out.print("Username >>  ");
		enteredUsername = consoleInput.next();
		consoleInput.nextLine();	// consumes any leftover input user inpropperly may have added
		
		System.out.print("Password >>  ");
		enteredPassword = console.readPassword();
		System.out.println("\n\n");
		
		// Attempt validation of entered credentials
		// Again, advanced programming here that I'm not yet "supposed to know"
		Scanner fileInput = new Scanner(Path.of(".//logindatabase.txt"), StandardCharsets.UTF_8);
		
		while(fileInput.hasNextLine()){
			String currentUsername = fileInput.next();
			String currentPassword = fileInput.next();
			fileInput.nextLine();	//consumes "remaining" line, and advances to next line
			
			// Check for verification
			usernameVerified = (currentUsername.equals(enteredUsername)) ? true : false;
			passwordVerified = (currentPassword.equals(String.valueOf(enteredPassword))) ? true : false;
			identityVerified = usernameVerified && passwordVerified;
			
			if(identityVerified) break;
		}
		
		// Again, more advanced coding relative to what I "should know"
		if(identityVerified) System.out.println("Welcome, " + enteredUsername);
		else System.out.println("Go away, fraud. We're calling the poliece and sending your butt to jail");
	
	}

}
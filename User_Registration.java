import java.util.Scanner;
import java.util.regex.*;

public class User_Registration {

	static String fName;

	static String firstName(){
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter your first name : ");
		fName = sca.nextLine();
		return fName;
	}

	public static void main(String args[]) {
		System.out.println("Welcome to User Registration Regex Problem");

		Boolean firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",User_Registration.firstName());

		if(Boolean.TRUE.equals(firstName))
		{
			System.out.println("Correct format");
		}
		else

		{
			System.out.println("Incorrect format try   'R'ushi this format");
		}

		System.out.println("First Name: " + fName);

	}
}


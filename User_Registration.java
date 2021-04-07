import java.util.Scanner;
import java.util.regex.*;

public class User_Registration {

	static String fName;
	static String lName;

	static String firstName(){
		Scanner sca1 = new Scanner(System.in);
		System.out.println("Enter your first name : ");
		fName = sca1.nextLine();
		return fName;
	}

 static String lastName(){
                Scanner sca2 = new Scanner(System.in);
                System.out.println("Enter your last name : ");
                lName = sca2.nextLine();
                return lName;
        }


	public static void main(String args[]) {
		System.out.println("Welcome to User Registration Regex Problem");

		Boolean firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",User_Registration.firstName());
                Boolean lastName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",User_Registration.lastName());

		if(firstName == true)
		{
                System.out.println("First Name: " + fName);
                        System.out.println("Correct format");
		}
		else

		{
			System.out.println("Incorrect format try   'R'ushi this format");
		}
		if(lastName == true)
                {
                System.out.println("Last Name: " + lName);
                        System.out.println("Correct format");
		}

		 else

                {
                        System.out.println("Incorrect format try   'T'ayade this format");
                }

	}
}


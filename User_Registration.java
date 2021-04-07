import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.regex.*;

public class User_Registration {

	static String fName;
	static String lName;
	static String email;

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

        static String emailId(){
                Scanner sca3 = new Scanner(System.in);
                System.out.println("Enter your E-Mail Id : ");
                email = sca3.nextLine();
                return email;
        }



	public static void main(String args[]) {
		System.out.println("Welcome to User Registration Regex Problem");

		Boolean firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",User_Registration.firstName());
                Boolean lastName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",User_Registration.lastName());
                Boolean emailId =  Pattern.matches("^[a][b][c][.][a-z]{3}[@][b][l][.][c][o][.][a-z]{2}",User_Registration.emailId());

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

		if(emailId == true)
                {
                System.out.println("E-Mail Id : " + email);
                        System.out.println("Correct format");
                }
                 else
                {
                        System.out.println("Incorrect format!");
                }


	}
}



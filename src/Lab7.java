
import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		// Variables
		Scanner in = new Scanner(System.in); //collect user input		
		String nameRegEx = "[A-Z][a-z]{1,29}"; //code to validate name
		String nameQuestion = "Please enter a valid Name:";
		String emailRegEx = "[a-z]{5,29}@[a-z\\d]{5,10}.[a-z\\d]{2,3}"; //code to validate email
		String emailQuestion = "Please enter a valid email:";
		String phoneRegEx = "\\d{3}-\\d{3}-\\d{4}"; //code to validate phone
		String phoneQuestion = "Please enter a valid phone number:";
		String dateRegEx = "[0-9]{2}\\/[0-9]{2}\\/[0-9]{4}"; //code to validate date
		String dateQuestion = "Please enter a valid date:";
		
		
		Validator.isItValid(Validator.getString(in,nameQuestion), nameRegEx, "Name");
		Validator.isItValid(Validator.getString(in,emailQuestion), emailRegEx, "Email");			
		Validator.isItValid(Validator.getString(in,phoneQuestion), phoneRegEx, "Phone");
		Validator.isItValid(Validator.getString(in,dateQuestion), dateRegEx, "Date");
		
		
		//close scanner object
		in.close();
	}
	
	
}

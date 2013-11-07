import java.util.Scanner;


public class KatieHoffmansBasicCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//first integer
		System.out.println("Please enter your first number:");
		System.out.println();
		float a = scan.nextFloat();
		System.out.println();

		while (true) {

			//operations
			System.out.println("To add, please enter '+'");
			System.out.println("To subtract, please enter '-'");
			System.out.println("To multiply, please enter '*'");
			System.out.println("To divide, please enter '/'");
			System.out.println("Enter 'q' to exit.");
			System.out.println();
			//charAt(0) makes the string into a character, the first character of the string
			char op = scan.next(".").charAt(0);

			while (op != '+' && op != '-' && op != '*' && op != '/' && op != 'q') {
				System.out.println("That was not a valid entry. Please re-enter your desired operation:"); 
				op = scan.next(".").charAt(0);
			}
			if (op == 'q'){
				break;		
			}
			//second integer
			System.out.println("Please enter your next number:");
			System.out.println();
			float b = scan.nextFloat();
			System.out.println();

			//equations
			if (op == '+'){
				a = a + b;
			}
			else if (op == '-'){
				a = a - b;
			}
			else if (op == '*'){
				a = a * b;
			}
			else if (op == '/'){
				a = a / b;
			}

			System.out.println();
			System.out.println("result = " + a);
			//else
		}
		//first while loop

		//goodbye
		System.out.println();
		System.out.println("Have a great day!");


	}
	//static void

}
//class

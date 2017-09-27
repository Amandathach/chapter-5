package conditionalLogic;
import java.util.Scanner;

public class conditionalLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age; //
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age?>>>>>");
		age = input.nextInt();
		if (age >= 23 & age <= 30)
			System.out.println("User is less than 18.");
		if (age > 18)
			System.out.println("User is older than 18");
		
		
		if(age >= 31 & age <= 50)
			System.out.println("User is older than 30");
		if(age >= 50 & age<= 65)
			System.out.println("User is older than 50");
		if(age >= 66 & age <= 100)
			System.out.println("User is older than 60");
	}

}

package tutorials;
import java.util.Scanner;

public class CellPhoneService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int minutes;
		int messages;
		int data;
		
		System.out.print("How many minutes do you need? More than five hundred or less?");
		minutes = input.nextInt();
		
		System.out.print("How many messages do you need? More than one hundred or less?");
		messages = input.nextInt();
		
		System.out.print("How many gigabytes do you need? More than two or less?");
		data = input.nextInt();
		
		if(minutes < 500 && messages < 100 && data < 2)
			System.out.print("The reccomended plan for you is Plan A. You get less than 500 minutes with "
					+ "0 text messages and no data for $49");
		
		if(minutes < 500 && messages > 100 && data < 2)
			System.out.print("The reccommended plan for you is Plan B. You get less than 500 minutes with unlimited "
					+ "textmessages and no data for $55");
		
		if(minutes > 500 && messages < 100 && data < 2)
			System.out.print("The recommended plan for you is Plan C. You get more than 500 minutes with up to 100  text messages "
					+ "and no data for $61");
		
		if(minutes < 450 && messages > 100 && data < 2)
			System.out.print("The recommended plan for you is Plan D. You get 0 minutes with more than "
					+ "100 text messages and no data for $70");
		
		if(minutes < 500 && messages < 100 && data < 3)
			System.out.print("The recommended plan for you is Plan E. You get no minutes or messages and 2 gigabytes of data for $79");
		
		if(minutes < 500 && messages < 100 && data > 2)
			System.out.print("The recommended plan for you is Plan F. You get no minites or messages and "
					+ "more than 2 gigabytes of data for $87");
		
	}

}

package tutorials;
import java.util.Scanner;

public class CondoSales2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int viewChosen;
		
		System.out.println("Choose 1 for park view, 2 for golf course view, or 3 for lake view.");
		viewChosen = input.nextInt();
		
		if(viewChosen ==1);
		{
		System.out.println("You have chosen the park view condo, at the cost of $150,000.");
		garageOrParkingSpace();
		}
		if(viewChosen == 2);
		{
		System.out.println("You have chosen the golf course view condo, at the cost of $170,000.");
		garageOrParkingSpace();
		}
		if(viewChosen == 3);
		{
		System.out.println("You have chosen the lake view condo, at the cost of $210,000.");
		garageOrParkingSpace();
		}
		
			System.out.println("The price is $0.");
		
	}
		public static void garageOrParkingSpace()
		{
		int choice;
		Scanner input = new Scanner(System.in);
		System.out.println("Choose 1 for a garage or 2 for a parking space.");
		choice = input.nextInt();
		
		if(choice == 1)
			System.out.println("An extra $5,000 has been added to the price of your condo.");
		
		if(choice == 2) {
			int parkingSpace;
			System.out.println("Congratulations, you have claimed a parking space.");
			System.out.println("Please choose the numbee for your parking space (1-30 are available) >>");
			parkingSpace = input.nextInt();
		
		if (parkingSpace > 30|| parkingSpace < 1)
			System.out.println("That is not a valid parking space number. Your cost has been reset to the cost of your condo.");
		
		}
		
	

}}

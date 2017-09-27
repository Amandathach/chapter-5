import java.util.Scanner;
public class pizzaHut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String choiceYes;
		String toppingChoice;
		String size;
		String pizzaKind;
		String choiceHotDog;
		double mediumCost = 9.99;
		double largeCost = 12.99;
		double smallCost = 6.99;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Would you like a pizza? Yes or No?>>>>>");
		choiceYes = input.nextLine();
		//this is where I am asking if they really want a pizza
		if("Yes".equalsIgnoreCase(choiceYes) "Y".equalsIgnoreCase(choiceYes)
				{
			System.out.println("You said" + choiceYes + "to having pizza.");
			System.out.print("Please choose a size small, medium or large? >>>>>");
			size = input.nextLine();
			if("small".equals(size) "Small".(equals(size))
				displayPizzaSize(size);
				displayPizzaType();
			
			if("medium".equals(size)) "Medium".equals(size)
			displayPizzaSize(size);
			displayPizzaType();
			displayPrice(size);
			
			if("large".equals(size)) "Large".equals(size)
			displayPizzaSize(size);
			displayPizzaType();
			displayPrice(size);
		
				}

}

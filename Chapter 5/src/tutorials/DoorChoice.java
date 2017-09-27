package tutorials;
import javax.swing.JOptionPane;
public class DoorChoice 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Door Prize program
		int response=1;
		String choiceString;
		int doorChoice;
		while(response == 1)
		{
		choiceString = JOptionPane.showInputDialog(null, "Pick a door any door, 1, 2, or 3." , 
				"Door Choice" , JOptionPane.INFORMATION_MESSAGE);
		doorChoice = Integer.parseInt(choiceString);
		
		//if statement structure for door choice
		if(doorChoice == 1);
			JOptionPane.showMessageDialog(null, "You win Nothing!! HAHAHAHA!");
		
		if(doorChoice == 2);
		JOptionPane.showMessageDialog(null, "You win less than nothing! HAHAHAHAHA");
			
		if(doorChoice == 3)
			JOptionPane.showMessageDialog(null, "You win a brand new Huffy Bike! HAHAHAHAH");
		
		if(doorChoice == 999)
			JOptionPane.showMessageDialog(null, "You win the state of Iowa, the whole state.");
		
		else
			JOptionPane.showMessageDialog(null, "That number was not an option, I said 1-3.");

		}
	}
	
}

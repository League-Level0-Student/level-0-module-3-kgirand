//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		for(int i=1; i<11;i++ ) {
			
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String input = JOptionPane.showInputDialog("What is your guess?(#)");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int num = Integer.parseInt(input);
			// 5. if the guess is correct
			if(random==num) {
				JOptionPane.showMessageDialog(null, "You Win!");
				System.exit(0);
			}
			// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			if(num>random) {
			JOptionPane.showMessageDialog(null, "Your guess was to high. Try again");	
			
			}
			// 9. if the guess is low
				// 10. Tell them it's too low
			if(num<random) {
			JOptionPane.showMessageDialog(null, "Your guess was to low. Try again");
			
			}
		// 13. Tell them they lose
		
	}
	JOptionPane.showMessageDialog(null, "You ran out of chances.");
}
}



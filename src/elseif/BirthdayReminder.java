
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "November 27th";
		String dadsBirthday = "October 11th";
		String myBirthday = "May 8th";
		// 2. Find out which birthday the user wants and and store their response in a variable
	String input = JOptionPane.showInputDialog("What who's birthday would you like to know? 1. Mom  2. Dad  3.Your own");
		int i = Integer.parseInt(input);
	// 3. Print out what the user typed
		System.out.println(i);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(i==1) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if(i==2) {
		JOptionPane.showMessageDialog(null, dadsBirthday);	
		}
		// 6. if user asked for your name
			// print myBirthday
		else if(i==3) {
		JOptionPane.showMessageDialog(null, myBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}

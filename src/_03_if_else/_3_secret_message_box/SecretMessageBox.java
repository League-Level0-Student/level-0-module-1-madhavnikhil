package _03_if_else._3_secret_message_box;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
		
	
	// 1. Set a password in a String variable
	String Password = "TheLeagueofAmazingProgrammers";
	// 2. Using a pop-up, ask the first person for a secret message and store it in a variable
    String Message = JOptionPane.showInputDialog("You will be a great computer engineer if you learn java.") ; 
	// 3. Now use a pop-up to tell the NEXT user that they can only see the secret message 
    String Nikhil = JOptionPane.showInputDialog("You can only see this message if you can guess the correct password.");
	//    if they can guess the passcode

	// 4. If their guess matches the password, show them the secret message
    if (Password.equals(Nikhil)) {
    	JOptionPane.showMessageDialog(null, Message);
    }
	// 5. If the password does not match, pop-up "INTRUDER!!"
    	else {
    	JOptionPane.showMessageDialog(null, "INTRUDER! !");	
    	}
	}
}

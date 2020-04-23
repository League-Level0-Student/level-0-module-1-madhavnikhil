package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019

//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String Igor = "Great time management";
		String Gavin = "The most incredible person at failing tests because of being so dumb at java.";
		String Dave = "The best at teaching java.";
		String Nikhil = "Great at maps and navigation.";

		// 2. Ask the user to enter a name. Store their answer in a variable.
		String Bobby = JOptionPane.showInputDialog("What is your name?");
		// 3. In a pop-up, tell the user what is remarkable about that person
		if (Bobby.equals("Nikhil")) {
			JOptionPane.showMessageDialog(null, Nikhil);
		}
		if (Bobby.equals("Igor")) {
			JOptionPane.showMessageDialog(null, Igor);
		}
		if (Bobby.equals("Gavin")) {
			JOptionPane.showMessageDialog(null, Gavin);
		}
		if (Bobby.equals("Dave")) {
			JOptionPane.showMessageDialog(null, Dave);
		}
	}
}
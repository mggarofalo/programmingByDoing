package twentyQuestions;

import javax.swing.*;

public class TwentyQuestionsWellActuallyJustTwo {
	public static void main(String[] args) {
		String selectedOption = null;
		boolean biggerThanABreadbox = false;

		String[] options = { "Animal", "Vegetable", "Mineral" };
		Object selected = JOptionPane.showInputDialog(null, "Is it an animal, a vegetable, or a mineral?",
				"Let's play a game", JOptionPane.QUESTION_MESSAGE, null, options, null);
		if (selected != null) { // Null if the user cancels
			selectedOption = selected.toString();
		} else {
			showCancelMessage();
		}

		options = new String[] { "Bigger", "Smaller" };
		Object breadbox = JOptionPane.showOptionDialog(null, "Is it bigger or smaller than a breadbox?",
				"How big is it?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
		if (breadbox.toString().equals("0")) {
			biggerThanABreadbox = true;
		} else if (breadbox.toString().equals("1")) {
			biggerThanABreadbox = false;
		} else {
			System.out.println("I honestly don't know what happened in the breadbox question.");
			System.out.println("breadbox variable string value: " + breadbox.toString());
		}

		if (selectedOption.equalsIgnoreCase("Animal")) {
			if (biggerThanABreadbox) {
				showGuess("It's a moose!");
			} else {
				showGuess("North American grey squirrel.");
			}
		} else if (selectedOption.equalsIgnoreCase("Vegetable")) {
			if (biggerThanABreadbox) {
				showGuess("Is it a prize-winning pumpkin?");
			} else {
				showGuess("Cucumber. No doubt.");
			}
		} else if (selectedOption.equalsIgnoreCase("Mineral")) {
			if (biggerThanABreadbox) {
				showGuess("Chevrolet Camaro. The king of cars.");
			} else {
				showGuess("Everybody's favorite software mascot, Clippy!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Something went wrong.", "Uh oh", JOptionPane.WARNING_MESSAGE);
		}
	}

	static void showCancelMessage() {
		JOptionPane.showMessageDialog(null, "Didn't want to play? Your loss. I had jokes.", "Party pooper",
				JOptionPane.PLAIN_MESSAGE);
	}

	static void showGuess(String s) {
		JOptionPane.showMessageDialog(null, s, "I get you", JOptionPane.PLAIN_MESSAGE);
	}
}
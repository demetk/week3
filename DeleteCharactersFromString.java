package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {
	
	String userInput;
	String toRemove;
	char charToRemove;
	char[] characterArray;
	char[] updatedArray;
	String result;
	String outcome;
	
	public void run() {
		while (true) {
		userInput = readLine("Enter a sentence: ");
		toRemove = readLine("Enter a character to remove: ");
			if (userInput == "" || toRemove == "") {
				break;
			} else {
				if (toRemove.length()>1) {
					println("Please enter a single character to remove.");
					userInput = readLine("Enter a sentence: ");
				} else {
					charToRemove = toRemove.charAt(0);
					String outcome = removeAllOccurances(userInput, charToRemove);
					println(outcome);
				} 
			}
			
		}
	}
	
	public String removeAllOccurances(String str, char ch) {
		convertToArray(str);
		updatedArray = new char[characterArray.length];
		int count = 0;
			for (int i=0; i<characterArray.length; i++) {
				if (((characterArray[i]) != charToRemove)) {
					updatedArray[count] = characterArray[i];
					count++;
				} else {
					continue;
				}
			}
			
		result = String.valueOf(updatedArray);
		return result;
	}

	public void convertToArray(String str) {
		characterArray = new char[str.length()];
		for (int i = 0; i<=str.length()-1; i++) {
			characterArray[i] = str.charAt(i);
		}
	}
}

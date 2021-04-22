package week3;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {
	
	public void run() {
		while (true) {
			digits = readLine("Enter a numeric string: ");
				if (digits.length() == 0) {
					break;
				}
				for (int i=0; i<digits.length(); i++) {
					char nextDigit = digits.charAt(i);
					if (!Character.isDigit(nextDigit)) {
						isNumberString = false;
					} 
				}
				if (isNumberString) {
					println(addCommasToNumericString(digits));
				} else {
					println("Please enter a value with numbers only.");
					isNumberString = true;
				  }

		}
	}
	
	private String addCommasToNumericString(String digits) {
		String result = "";
		int count = 0;
			for (int i=(digits.length()-1); i>-1; i--) {
				if ((count == 3) && (i>-1)) {
					result = digits.charAt(i) + "," + result;
					count = 1;
				} else {
					result = digits.charAt(i) + result;
					count++;
				}
			}
		return result;
	}
	
	String digits;
	boolean isNumberString = true;
	
}

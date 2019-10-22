//Author Ryley Lamb
//Professor Debra Calliss
//CSE 360
//Assignment 1
//Class Number: 70642
//Due 10/02/19
//Purpose:
//			Correctly determine if a string inserted is a Palindrome with 
//			exclusions of spaces and only digits and characters input
//
package assign1;

/**
 *  
 * @author Ryley Lamb
 * @version Assignment 1.0
 * 
 *
 */
public class Palindrome {

	/**
	 * Stores the testString
	 */
	private String testString;

	/**
	 * Palindrome constructor
	 * <p>
	 * Initializes the string from input to be tested on
	 * </p>
	 * @param input
	 */
	public Palindrome(String input) {

		testString = input;

	}

	/**Determines if string is a palindrome
	 * <p>
	 * Checks each character to see if it has an equal complement
	 * Ignoring all characters that are not a digit or english character
	 * </p>
	 * 
	 * @return false if not a Palindrome, true if a palindrome
	 */
	public boolean isPalindrome() {
		
		
		/**
		 * A flag that at the end the end of determining if its a palindrome
		 * Will either be true or false
		 */
		boolean notPalin = false;
		

		if (testString == null) { //Null Strings will not be palindromes
			return false;
		} else {
			//stores the size of the String - 1
			int end = testString.length() - 1;
			
			//Stores the initial index of the character of the string
			int start = 0;

			while (!notPalin && (end > start)) {

				if (!Character.isLetterOrDigit(testString.toLowerCase().
						charAt(start))) {
					start++;
				} else if (!Character.isLetterOrDigit(testString.
						toLowerCase().charAt(end))) {
					end--;
				} else if (testString.toLowerCase().charAt(start) != 
						testString.toLowerCase().charAt(end)) {
					notPalin = true;
				} else {
					start++;
					end--;
				}
			}

			if (notPalin) { // If it isn't a palindrome, return false
				return false;
			} else { // else return true
				return true;
			}
		}
	}
}
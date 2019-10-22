//Author Ryley Lamb
//Professor Debra Calliss
//CSE 360
//Assignment 1
//Class Number: 70642
//Due 10/02/19
//Purpose:
//			Test the functionality of the Palindrome.java class to make sure
//			methods are working correctly

package assign1;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	//Palindrome test to see if Palindrome constructor works in Palindrome.java
	@Test	
	public void testPalindrome() {
		Palindrome testValue = new Palindrome("StartPal");
		assertNotNull(testValue);						//Testing if palindrome constructor functions
	}
	
	@Test	//isPalindrome test to see if boolean method works in Palindrome.java
	public void testIsPalindrome() {
		Palindrome badPal = new Palindrome("False");	//displaying incorrect Palindrome
			assertEquals(false,badPal.isPalindrome());
		badPal = new Palindrome("NotPal");				//displaying incorrect Palindrome
			assertEquals(false,badPal.isPalindrome());
		badPal = new Palindrome(null);					//displaying a null input as not a palindrome
			assertEquals(false,badPal.isPalindrome());
			
			
		Palindrome goodPal = new Palindrome(" ");		//A palindrome that is just a space
			assertEquals(true,goodPal.isPalindrome());	
		goodPal = new Palindrome("kayak");				//Normal kayak
			assertEquals(true,goodPal.isPalindrome());
		goodPal = new Palindrome("k a y a k");			//kayak with spaces in name
			assertEquals(true,goodPal.isPalindrome());
		goodPal = new Palindrome("k#a^y$a!k ");			//kayak with random non digits or characters
			assertEquals(true,goodPal.isPalindrome());
		goodPal = new Palindrome(" k  a  y a        k");//kayak with random amounts of spaces in name
			assertEquals(true,goodPal.isPalindrome());
		goodPal = new Palindrome("Kayak");				//kayak with a capital case letter
			assertEquals(true,goodPal.isPalindrome());
		goodPal = new Palindrome("my gym");				//my gym
			assertEquals(true,goodPal.isPalindrome());
		goodPal = new Palindrome("My Gym");				//My Gym with capital case
			assertEquals(true,goodPal.isPalindrome());
		goodPal = new Palindrome("mY gYM!");			//mY gYM! with capital case and a non alphanumeric character
			assertEquals(true,goodPal.isPalindrome());
		goodPal = new Palindrome("Step On No Pets");	//Longer palindrome statement
			assertEquals(true,goodPal.isPalindrome());
		goodPal = new Palindrome("StEp On No PeTs");	//longer palindrome with camelcase
			assertEquals(true,goodPal.isPalindrome());
		goodPal = new Palindrome("sTeP oN nO pEtS");	//Longer palindrome with different camelcase
			assertEquals(true,goodPal.isPalindrome());
		goodPal = new Palindrome("1234321");			//Palindrome with numbers only
			assertEquals(true,goodPal.isPalindrome());
		goodPal = new Palindrome("123kayak321");		//Palindrome with numbers and characters 
			assertEquals(true,goodPal.isPalindrome());
		goodPal = new Palindrome("wooow");				//Just another palindrome
			assertEquals(true,goodPal.isPalindrome());
					
	}
}

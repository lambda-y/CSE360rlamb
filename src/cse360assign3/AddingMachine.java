//Author Ryley Lamb
//Professor Debra Calliss
//CSE 360
//Assignment 3
//Class Number: 70642
//Due 10/21/19
//Purpose:
//			Demonstrate class knowledge in a calculator scenario and demonstrate
//			Working github knowledge
//


package cse360assign3;


/**
 * Represents a basic Adder that only has subtract and Addition operations
 * While keeping history of the operations made.
 * @author Ryley Lamb
 * @version Assignment 3 - Updated from Version Assignment 2
 */
public class AddingMachine {

	protected int total;
	protected String TransactionHistory = "0 ";
	
	/**
	 * Constructs the adding machine by setting the total to 0
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns current total
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds value to the total
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
		if(value < 0) {
			TransactionHistory = TransactionHistory + value + " ";
		} else {
			TransactionHistory = TransactionHistory +"+"+ value + " ";
		}
	}
	
	/**
	 * Subtracts value from the total
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		if(value < 0) {
			TransactionHistory = TransactionHistory +"+"+ value + " ";
		} else {
			TransactionHistory = TransactionHistory +"-"+ value + " ";
		}
	}
	
	
	/**
	 * Returns the String Transaction history with all transactions made
	 * 	@return TransactionHistory
	 */
	public String toString () {
		return TransactionHistory;
	}

	/**
	 * Resets the total and transaction history
	 */
	public void clear() {
		total = 0;
		TransactionHistory = "0 ";
	}
}

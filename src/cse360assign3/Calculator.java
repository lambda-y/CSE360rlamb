//Author Ryley Lamb
//Professor Debra Calliss
//CSE 360
//Assignment 3
//Class Number: 70642
//Due 10/21/19
//Purpose:
//			Demonstrate class knowledge in a calculator scenario and demonstrate
//			Working github knowledge and inheritance 
//

package cse360assign3;

/**
 * Simple inheritance demonstration that adds 3 new functions of Divide
 * Multiply and raising the total to a power
 * @author Ryley Lamb
 * @category CSE360 
 * @version Assignment 3
 *
 */
public class Calculator extends AddingMachine {

	
	/**
	 * Constructs the Adding machine by calling super() for Calculator
	 */
	public Calculator() {
		super();

	}

	/**
	 * Multiplies the total by value
	 * @param value
	 */
	public void multiply(int value) {
		super.total = super.total * value;
		super.TransactionHistory = super.TransactionHistory + "*" + value + " ";
		//System.out.println(super.total);
	}

	/**
	 * Divides the total by value and if zero will set total to zero
	 * @param value
	 */
	public void divide(int value) {
		if(value == 0) {
			super.total = 0;
		} else {
			super.total = super.total / value;
		}
		super.TransactionHistory = super.TransactionHistory + "/" + value + " ";
	}

	/**
	 * Raises the total to the power of value and if value is less than zero
	 * It will set total to zero
	 * @param value
	 */
	public void pow(int value) {
		if(value < 0) {
			super.total = 0;
		} else {
			super.total = (int) Math.pow(getTotal(), value);
		}
		super.TransactionHistory = super.TransactionHistory + "^" + value + " ";
	}

}

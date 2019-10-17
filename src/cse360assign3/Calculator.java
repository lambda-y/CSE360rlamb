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
 * 
 * @author Ryley Lamb
 *
 */
public class Calculator extends AddingMachine {

	
	/**
	 * 
	 */
	public Calculator() {
		super();

	}

	/**
	 * 
	 * @param value
	 */
	public void multiply(int value) {
		super.total = super.total * value;
		super.TransactionHistory = super.TransactionHistory + "*" + value + " ";
		//System.out.println(super.total);
	}

	/**
	 * 
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
	 * 
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

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

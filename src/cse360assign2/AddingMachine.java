//Author Ryley Lamb
//Professor Debra Calliss
//CSE 360
//Assignment 2
//Class Number: 70642
//Due 10/14/19
//Purpose:
//			Demonstrate class knowledge in a calculator scenario and demonstrate
//			Working github knowledge
//
package cse360assign2;

public class AddingMachine {

	private int total;
	private String TransactionHistory = "0 ";
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total + value;
		if(value < 0) {
			TransactionHistory = TransactionHistory + value + " ";
		} else {
			TransactionHistory = TransactionHistory +"+"+ value + " ";
		}
	}
	
	public void subtract (int value) {
		total = total - value;
		if(value < 0) {
			TransactionHistory = TransactionHistory +"+"+ value + " ";
		} else {
			TransactionHistory = TransactionHistory +"-"+ value + " ";
		}
	}
		
	public String toString () {
		return TransactionHistory;
	}

	public void clear() {
		total = 0;
		TransactionHistory = "0 ";
	}
}

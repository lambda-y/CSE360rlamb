package cse360assign2;

public class AddingMachineRlamb {

	private int total;
	private String TransactionHistory = "0 ";
	
	public AddingMachineRlamb () {
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

//AddingMachineDriver

package cse360assign3;

public class AddingMachineDriver{
		
	public static void main(String args[]) {
		
		AddingMachine calculator = new AddingMachine();
		
		calculator.add(5);
		
		calculator.add(9);
		
		calculator.add(-2);
		
		calculator.subtract(4);
		
		System.out.println(calculator.toString());
		
	}
	
}
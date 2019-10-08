//AddingMachineDriver

package cse360assign2;

public class AddingMachineDriver{
		
	public static void main(String args[]) {
		
		AddingMachineRlamb calculator = new AddingMachineRlamb();
		
		calculator.add(5);
		
		calculator.add(9);
		
		calculator.add(-2);
		
		calculator.subtract(4);
		
		System.out.println(calculator.toString());
		
	}
	
}
//Author Ryley Lamb
//Professor Debra Calliss
//CSE 360
//Assignment 3
//Class Number: 70642
//Due 10/21/19
//Purpose:
//			Demonstrate class knowledge in a calculator scenario and demonstrate
//			Working github knowledge and inheritance 
//			Test functionality of inheritance program
//

package cse360assign3;

public class CalculatorDriver {

	public static void main(String args[]) {

		//Adding machine functions
		Calculator calc1 = new Calculator();
		calc1.add(6); // Total 6 (calc1)
		calc1.subtract(2); // Total 4 (calc1)
		
		//Calculator function
		calc1.multiply(2); // Total 8 (calc1)

		System.out.println("calc1 Total: " + calc1.total + " Transactions: " + calc1.TransactionHistory);

		//Seperate calculator
		Calculator calc2 = new Calculator();
		calc2.add(3); // Total 3 (calc2)
		
		//Calculator functions
		calc2.multiply(4); // Total 12(calc2)
		calc2.divide(2); // Total 6 (calc2)
		calc2.divide(-2); // Total -3(calc2)

		System.out.println("calc2 Total: " + calc2.total + " Transactions: " + calc2.TransactionHistory);

		//Calculator functions
		calc1.divide(-4); // Total -2(calc1)
		calc1.pow(2); // Total 4 (calc1)

		System.out.println("calc1 Total: " + calc1.total + " Transactions: " + calc1.TransactionHistory);

		
		//Calculator functions that set totals to zero
		calc1.divide(0);
		calc2.pow(-1);
		System.out.println("calc1 Total: " + calc1.total + " Transactions: " + calc1.TransactionHistory);
		System.out.println("calc2 Total: " + calc2.total + " Transactions: " + calc2.TransactionHistory);
		
	}
}

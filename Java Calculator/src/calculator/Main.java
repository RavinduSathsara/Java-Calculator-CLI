package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanObj = new Scanner(System.in);
		
		System.out.println("Choose oparator  ('+')  ,  (-)  , ('/')  , ('*') ");
		
		String oparetor = scanObj.nextLine();
		
		System.out.print("Enter your first value : ");
		int firstValue = scanObj.nextInt();
		
		System.out.print("Enter your Last value  : ");
		int lastValue = scanObj.nextInt();
		
		Sum sumObj = new Sum();
		Min minObj = new Min();
		Mul mulObj = new Mul();
		Dev devObj = new Dev();
		
		switch (oparetor) {
		case "+": 
			sumObj.sum(firstValue, lastValue);
			break;
		case "-":
			minObj.min(firstValue, lastValue);
			break;
		case "*":
			mulObj.mul(firstValue, lastValue);
			break;
		case "/":
			devObj.dev(firstValue, lastValue);
			break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + oparetor);
		}
		
		
		

	}

}

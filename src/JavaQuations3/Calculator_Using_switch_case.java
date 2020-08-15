package JavaQuations3;

import java.util.Scanner;

public class Calculator_Using_switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);	
		System.out.println("Enter two numbers :");
	double first=reader.nextDouble();
	double second=reader.nextDouble();
	System.out.println("Enter your Operator :(+; -, * ; / )");
	
	char operator=reader.next().charAt(0);
	double result=0;
	
	switch (operator) {
	case '+':
		result=first+second;
		break;
	case '-':
		result=first-second;
		break;
	case '*':
		result=first*second;
		break;
	case '/':
		result=first/second;
		break;

	default:
		System.out.println("please enter your correst operation");
		break;
	}
	System.out.println("output is :" + result);
	
	}

}

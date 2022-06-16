package SimpleProjects;

import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args)
	{
		char operator;
		double number1;
		double number2;
		double result;
		
		//user inputs the numbers and operation
		Scanner input = new Scanner(System.in);
		
		//ask user to enter operator
		System.out.println("Choose an operator: +, -, * or /");
		operator = input.next().charAt(0);
		
		//ask user for numbers
		System.out.println("Enter first number");
		number1 = input.nextDouble();
		
		System.out.println("Enter second number");
		number2 = input.nextDouble();
		
		switch (operator)
		{
		// Performs the addition
		case '+':
			result = number1 + number2;
			System.out.println(number1 + " + " + number2 + " = " + result);
			break;
			
		//Performs subtraction	
		case '-':
			result = number1 - number2;
			System.out.println(number1 + " - " + number2 + " = " + result);
			break;
			
		//performs multiplication
		case '*':
			result = number1 * number2;
			System.out.println(number1 + " * " + number2 + " = " + result);
			break;
			
		//performs division
		case '/':
			result = number1 / number2;
			System.out.println(number1 + " / " + number2 + " = " + result);
			break;
			
		default:
			System.out.println("Invalid operator!");
			break;
		}
		
		input.close();
	}
}

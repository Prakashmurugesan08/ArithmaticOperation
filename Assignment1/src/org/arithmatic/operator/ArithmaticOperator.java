package org.arithmatic.operator;

import java.util.Scanner;

public class ArithmaticOperator {
public static void main(String[] args) {
		
		Double number1,number2,result;
		char operator;
		char repeat;
		Scanner s=new Scanner(System.in);
	do {	
		System.out.println("Enter 1st number");
		number1 =s.nextDouble();
		System.out.println("Enter 2nd number");
		number2 =s.nextDouble();
		
		System.out.println("1.Addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("choose the option ");
		operator =s.next().charAt(0);
		
		switch (operator) {
		case '1':
			result=number1 + number2;
			System.out.println("the sum of 2 num is "+ result);
			break;
		case '2':
			result=number1 - number2;
			System.out.println("the subtraction of 2 num is "+ result);
			break;
		case '3':
			result=number1 * number2;
			System.out.println("multiple of 2 num is " + result);
			break;
		case '4':
			result=number1 / number2;
			System.out.println("the division of 2 num is "+ result);
			break;
		default:
			System.out.println("Invalid operator");
			break;
			
		}
		System.out.println("Do you want to continue Y/N:");
		repeat=s.next().charAt(0);
		}
		while(repeat=='Y'|| repeat=='y');
		System.out.println("Thank you");
		
		s.close();
		
		
	}





}

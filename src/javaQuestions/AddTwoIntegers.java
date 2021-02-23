package javaQuestions;

import java.util.Scanner;

public class AddTwoIntegers {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a  = reader.nextInt();
		
		System.out.println("Enter second number: ");
		int b  = reader.nextInt();
		
		System.out.println("Sum of 2 numbers is : " +(a+b));

	}

}

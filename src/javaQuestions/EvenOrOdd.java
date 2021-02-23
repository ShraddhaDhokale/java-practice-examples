package javaQuestions;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x = reader.nextInt();
		if ( x % 2 == 0){
			System.out.println("The number is even");
		}else{
			System.out.println("The number is odd");
		}
	}

}

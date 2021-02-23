package javaQuestions;

import java.util.Scanner;

public class Positive_Negative_Num {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		double num = reader.nextDouble();
		if (num < 0.0 ){
			System.out.println("The number is Negative");
		}else if (num > 0.0){
			System.out.println("The number is positive");
		}else{
			System.out.println("The number is zero");
		}

	}

}

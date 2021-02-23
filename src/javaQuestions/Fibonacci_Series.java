package javaQuestions;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13
		
		int t1 = 0;
		int t2 = 1;
		int sum = 0;
		for (int i=1; i<=10; i++){
			System.out.println(t1);
			sum = t1+t2;
			t1 = t2;
			t2 = sum;
		}
		System.out.println("Sum is: "+sum);
	}

}

package javaQuestions;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a =10;
		int b = 20;
//		int temp = a;
//		a = b;
//		b = temp;
//		System.out.println("value of a: "+a);
//		System.out.println("value of b: "+b);
//		
		//without temp
		
		a = a-b;//-10
		b = a+b;//10
		a = b-a;//10-(-10)=20
		System.out.println("value of a: "+a);
		System.out.println("value of b: "+b);
		
	}

}

package javaQuestions;

public class SUmOfNaturalNumbers {

	public static void main(String[] args) {
		int Num = 100;
		int sum = 0;
		
		//using for loop:
//		for(int i=1; i<=100; i++){
//			sum = sum + i;
//		}
//		System.out.println("The sum is: "+sum);
		
		
		//using while loop:
		int count = 1;
		while(count <= Num){
			sum = sum + count;
			count++;
		}
		System.out.println("The sum is: "+sum);
	}

}

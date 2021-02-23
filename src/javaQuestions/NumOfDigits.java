package javaQuestions;

public class NumOfDigits {

	public static void main(String[] args) {
		//1234
		int num = 1234999;
		
		int count = 0;
		while(num!=0){
			num = num/10;
			count++;
		}
		System.out.println("Num of digits is: "+count);

	}

}

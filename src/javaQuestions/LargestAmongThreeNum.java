package javaQuestions;

public class LargestAmongThreeNum {

	public static void main(String[] args) {
		int x = 500;
		int y = 500;
		int z = 300;
		
		if ( x>y && x>z){
			System.out.println("x is the greatest num");
		}else if ( y>z ){
			System.out.println("y is the greatest nume");
		}else{
			System.out.println("z is the greatest num");
		}
	}

}

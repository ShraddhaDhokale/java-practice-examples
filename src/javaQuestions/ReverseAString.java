package javaQuestions;

public class ReverseAString {

	public static void main(String[] args) {
		//"abcd" --> "dcba"
		
		//1. using for loop
		String str = "abcd";
		String rev = "";
		for (int i=str.length() - 1; i >= 0; i-- ){
			rev = rev + str.charAt(i);
		}
		System.out.println("Reversed string is ====>"+rev);
		
		//2. using stringBuffer clas
		StringBuffer sf = new StringBuffer(str);
		System.out.println(sf.reverse());
		
	}

}

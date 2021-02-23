package javaQuestions;

public class VowelOrConsonant {

	public static void main(String[] args) {
		//a,e,i,o,u
		
		char ch = 'i';
		
//		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//			System.out.println("The char is a vowel");
//		}else{
//			System.out.println("The char is a consonant");
//		}
		
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("The char is a vowel");
			break;

		default:
			System.out.println("The char is a consonant");
			break;
		}

	}

}

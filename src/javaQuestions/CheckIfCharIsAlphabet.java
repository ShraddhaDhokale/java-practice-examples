package javaQuestions;

public class CheckIfCharIsAlphabet {

	public static void main(String[] args) {
		char ch = 'v';
		if ( (ch <= 'Z' && ch >= 'A') || (ch <= 'z' && ch >= 'a') )
			System.out.println(ch +" is an alphabet");
		else
			System.out.println(ch +" is not an alphabet");
	}

}

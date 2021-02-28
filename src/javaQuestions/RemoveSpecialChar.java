package javaQuestions;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		String s = "#####Hi There. How are$$$$ you";
		
		System.out.println(s.replaceAll("[^a-zA-Z0-9 ]", ""));

	}

}

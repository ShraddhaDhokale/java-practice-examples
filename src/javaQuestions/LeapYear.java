package javaQuestions;

public class LeapYear {

	public static void main(String[] args) {
	//divisibe by 4
	//century year - year ending in 00 - it should be also divisible by 400
	//1900 is not a leap year, but 2000 is
		
		int year = 1900;
		boolean leap = false;
		if ( year%4 == 0){
			if ( year%100 == 0){
				if (year%400 == 0){
					leap = true;
				}
			}else{
				leap = true;
			}
		}else{
			leap = false;
		}
		
		if(leap){
			System.out.println(year+ " is a leap year");
		}else{
			System.out.println(year+ " is not a leap year");
		}
	}

}

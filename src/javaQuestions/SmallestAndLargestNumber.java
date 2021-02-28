package javaQuestions;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args){
		
		int arr[] = {-10, 34, 111, -88, 98765};
		
		int largest = arr[0];
		int smallest = arr[0];
		
		for (int i=1; i<arr.length; i++){
			if (arr[i] > largest){
				largest = arr[i];
			}else{
				if (arr[i] < smallest){
					smallest = arr[i];
				}
			}
		}
		
		System.out.println("Array===>"+Arrays.toString(arr));
		System.out.println("largest number====>"+largest);
		System.out.println("smallest number===>"+smallest);
		
	}
}

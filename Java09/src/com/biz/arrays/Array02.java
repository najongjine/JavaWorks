package com.biz.arrays;

import java.util.Random;

public class Array02 {

	public static void main(String[] args) {
		Random rnd=new Random();
		int[] intArray=new int[100];
		int intEvenTotal=0, intOddTotal=0;
		
		for(int i=0; i<intArray.length; i++) {
			intArray[i]=rnd.nextInt(10)+1;
			
			if(intArray[i]%2==0) {
				intEvenTotal+=intArray[i];
			}
			if(intArray[i]%2==1) {
				intOddTotal+=intArray[i];
			}
		}
		System.out.println("생선된 숫자중 짝수의 합: "+intEvenTotal);

	}

}

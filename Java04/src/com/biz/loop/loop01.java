package com.biz.loop;

public class loop01 {

	public static void main(String[] args) {
		
		for(int nCount=1, intNum1=2; nCount<=9; nCount++) {
			System.out.printf("%d * %d = %2d\n", intNum1, nCount, intNum1*nCount);
		}
		System.out.println("-----------------------------");
		
		int numStart=1, num1=0 ,num2 =0, numUntill=2;
		for(num1=numStart; num1<=numUntill; num1++) {
			//System.out.println(sum=sum+i);
			num2=num2+num1;
		}
		System.out.println(numStart + "~" + numUntill + "까지 덧셈 : " +num2);
		
		for( int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d\n", i,j,i*j);
			}
			
		}
	
	}

}

package com.biz.classes.string;

public class String06 {

	public static void main(String[] args) {
		int intMultiple=7, intSearch=2, intMax=100;
		for (int i=1, count=0, targetNum=0; i<=intMax; i++) {
			/*
			 * 1부터 100까지 숫자 중에서 7의 배수가 2번째로 나타나면 
			 * 그 값을 표시 하시고
			 */
			if(i%intMultiple==0) {
				count++;
				targetNum=i;
				
			}
			if(count==intSearch){
				System.out.println(intSearch + "번째 " +  intMultiple + "의 배수: "+ targetNum);
				break;
			}
		}
		/*
		 *
		 */

	}

}

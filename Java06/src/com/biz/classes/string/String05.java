package com.biz.classes.string;

public class String05 {

	public static void main(String[] args) {
		for (int i=1, count=0, targetNum=0; i<=100; i++) {
			/*
			 * 1부터 100까지 숫자 중에서 7의 배수가 2번째로 나타나면 
			 * 그 값을 표시 하시고
			 */
			if(i%7==0) {
				count++;
				targetNum=i;
				
			}
			if(count==2){
				System.out.println(count + "번째 " +"7의 배수: "+ targetNum);
				break;
			}
		}
		/*
		 * Hard Coding 의 예.
		 * 이 코드에서ㅗ 7의 배수가 2번째 나타나는 경우라고 정의하여
		 * 7과 2의 값을 고정된 숫자로 사용했다.
		 * 만약 이 코드를 8의 배수가 5번째 나타나는 경우로 변경할경우
		 *코드 중간을 7을 8로 2를 5로 변경해야 한다.
		 *
		 *코드를 다른 용도로 쇼ㅏ용하고자 할때 썩 좋은 코드가 아니다.
		 */

	}

}

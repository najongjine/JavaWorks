package com.biz.for_if;

public class If04 {

	public static void main(String[] args) {
		int intNum1=3*4*2;
		
		if(intNum1%3==0 && intNum1%6==0) {
			// 3의 배수다
			System.out.println(intNum1 + " 는 3의 배수이며 6의 배수다");
		}
		
		int intAge=121;
		
		//나이의 조건은 0세 이상과 120세 이하의 값만 허용한다.
		//intAge의 조건이 맞지 않으면 메세지를 표시하시오.
		
		if(!(0<=intAge && intAge<=120)) {
			System.out.println("나이의 조건이 잘못 됬음");
		}
		
		if(intAge<0 || intAge >120) {
			System.out.println("조건에 맞지 않음2");
		}

	}

}

package com.biz.classes;

import com.biz.classes.model.StudentVO;

public class ClassEx02 {
	public static void main(String[] args) {
		/*
		 * StudentVO 클래스를 10개 복제하여 사용할수 있도록
		 * 메모리를 준비 하라.
		 * 생성자와는 다른 형식. 배열의 선언임.
		 */
		//객체선언
		StudentVO[] stVO=new StudentVO[10];//java jdk에 없음
		//User Define Class|User Define Type
		
		/*
		 * 기본형 변수+String형 변수는 배열을 선언만 해도 자체적으로
		 * 초기화하는 코드가 샐행되도록 만들어짐.
		 */
		String[] strString=new String[10];
		
		/*
		 * stVO[i]: stVO배열의 i번 위치에 있는 요소에 접근하겠다
		 * 
		 * 배열을 선언할때 개수를 정하는데, 자바 컴파일러는 
		 * 배열.length라는 맴버변수를 하나 생성하고
		 * 값을 배열의 개수로 세팅해 준비해 둔다.
		 * 
		 */
		for(int i=0; i<stVO.length; i++) {//객체 요소의 초기화
			stVO[i]=new StudentVO();//[0]:= array index|배열첨자
		}
		
		stVO[0].strNum="001";
		stVO[0].strName="dfd";
		
		/*
		 * stVO를 초기화 하지 않았을 경우(배열 선언만 한 경우)
		 * stVO배열은 10개의 메모리 장소를 사요ㅗㅇ하겠다라고 선언만 된 상태
		 * stVO의 각 맴버 변수에 접근을 시도하면 아직 vsVO요소들이 초기화가 되지 않아
		 * exception이 발생
		 */
	}
}

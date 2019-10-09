package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;

/*
 * 자바의 Collections(framework,도구모음) 다량의 데이터를 취급하는 용도로 사용
 * 기본배열의 여러가지 단점들을 해결할 용도로 만들어진 클래스들의 모음집
 * 
 * List(ArrayList)가 많이 사용되는 데이터구조
 * 1.데이터개수를 미리 정하지 않음
 * 2.필요의 따라서 개수를 추가|삭제함
 * 3.다양한 method를 활용하여 여러 연산을 쉽게 처리할수 있다.
 */
public class List01 {
	public static void main(String[] args) {
		/*
		 * 정수들을 담을 nums 리스트 선언.
		 * nums 리스트를 사용할수 있도록 생성,초기화
		 */
		List<Integer> nums; //int [] nums와 흡사
		nums=new ArrayList<Integer>(); //nums=new int[0]
		
		nums.add(100);
		nums.add(5);
		nums.add(1);
		//3개짜리 리스트 완성
	}

}

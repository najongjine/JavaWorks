package com.biz.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List01 {
	public static void main(String[] args) {
		List<Integer> intList=new ArrayList<Integer>();
		List<String> strList;
		strList=new ArrayList<String>();
		
		intList=new LinkedList<Integer>();
		strList=new LinkedList<String>();
		/*
		 * List 인터페이스로 선언한 객체는 ArrayList,LinkedList클래스로 초기화,
		 * 생성하여 사용할수 있다.
		 */
		/*				추가/삭제		get(index)조회
		 * ArrayList	달팽이			치타
		 * LinkedList	치타			달팽이
		 */
	}
}

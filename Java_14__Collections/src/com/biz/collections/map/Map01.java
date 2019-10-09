package com.biz.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.biz.collections.model.GradeVO;

public class Map01 {

	public static void main(String[] args) {
		/*
		 * Collection 프레임워크의 list,set 와는 다른 형식의 데이터구조
		 * List,Set은 한가지 type만을 리스트로 포함하는 구조.
		 * Map은 2가지 type의 자료를 한묶음의 리스트로 포함하며,
		 * key, value라는 독특한 구조를 가지고 있다.
		 * 연상리스트.
		 * 
		 * 데이터를 저장할때 key,value 쌍으로 put을 하며
		 * 데이터를 조회할때 key값만으로 빠르고 쉽게 찾을수 있다.
		 * 데이터가 어떤 위치(index)에 있는지 몰라도 key내용으로 연상검색 한다.
		 */
		Map<String, String> strMap=new HashMap<String, String>();
		
		strMap.put("1", "aaa");
		strMap.put("3", "baaa");
		strMap.put("2", "agaa");
		strMap.put("5", "caa");
		strMap.put("9", "aaaba");
		strMap.put("aaa", "aaa");
		
		System.out.println(strMap.get("aaa"));
		
		Map<String, GradeVO> grades=new HashMap<String,GradeVO>();
		GradeVO vo=new GradeVO();
		vo.setStrName("홍씨");
		vo.setIntEng(88);
		vo.setIntKor(89);
		vo.setIntMath(67);
		grades.put("홍씨", vo);
		
		vo=new GradeVO();
		vo.setStrName("김모모");
		vo.setIntEng(98);
		vo.setIntKor(69);
		vo.setIntMath(67);
		grades.put("김모모", vo);
		
		vo=new GradeVO();
		vo.setStrName("박모모");
		vo.setIntEng(98);
		vo.setIntKor(99);
		vo.setIntMath(97);
		grades.put("박모모", vo);
		
		System.out.println(grades.get("홍씨").toString());
		
		Set<String> gradeKeys= grades.keySet();
		for(String s:gradeKeys) {
			GradeVO v=grades.get(s);
			System.out.println(vo.toString());
		}

	}

}

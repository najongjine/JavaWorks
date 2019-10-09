package com.biz.string.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.string.domain.StudentVO;

public class StringServiceImpV1 implements StringService {
	List<String> strList;
	Scanner scan;
	Random rnd;
	
	public StringServiceImpV1() {
		super();
		strList=new ArrayList<String>();
		scan=new Scanner(System.in);
		rnd=new Random();
	}
	
	public StringServiceImpV1(List<String> strList) {
		super();
		this.strList = strList;
	}

	public void input() {
		String[] strStudent=new String[] {
				"aaaaa:lll",
				"bbbbbb:ccc",
				"cccccccc:bbb"
		};
	}
	public void list() {
		
	}
	public void view() {
		
	}

	@Override
	public StudentVO view(String strNum) {
		return null;
		// TODO Auto-generated method stub
		
	}
}

package com.biz.collections.exec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test01 {

	public static void main(String[] args) {
		Random rnd=new Random();
		List<String> strNums=new ArrayList<String>();
		for(int i=0;i<10;i++) {
			strNums.add(String.format("%06d",rnd.nextInt(100)));
		}
		Collections.sort(strNums);
		System.out.println(strNums);

	}

}

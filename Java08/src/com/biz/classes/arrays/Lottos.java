package com.biz.classes.arrays;

import java.util.Random;

public class Lottos {

	public static void main(String[] args) {
		Random rnd=new Random();
		int [] lottos=new int[6];
		int nLottoIndex=0;
		
		while(true) {
			int lotNum=rnd.nextInt(45)+1;
			int index;
			for(index=0; index< lottos.length; index++) {
				if(lottos[index]==lotNum) break;
			}
			if(index>=lottos.length) {
				lottos[nLottoIndex++]=lotNum;
			}
			if(nLottoIndex>=lottos.length) break;
		}
		
		for(int i=0;i<lottos.length;i++) {
			System.out.print(lottos[i]+", ");
		}

	}

}

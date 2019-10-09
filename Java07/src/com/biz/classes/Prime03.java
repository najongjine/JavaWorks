package com.biz.classes;

public class Prime03 {
	public static void main(String[] args) {
		int index1=0,index2=0;
		
		for(index1=2; index1<=100000; index1++) {
			for(index2=2; index2<index1; index2++) {
				if(index1%index2==0) break;
			}
			if(index2>=index1) System.out.println(index1 + "\t");
		}
		
	}
}

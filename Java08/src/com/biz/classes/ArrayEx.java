package com.biz.classes;

import java.util.Scanner;

import com.biz.classes.service.ArrayScanService;

public class ArrayEx {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayScanService aService=new ArrayScanService(10);
		while(true) {
			aService.scanArrayAll();
			System.out.println("press END to quit");
			String str=scanner.nextLine();
			if(str.equals("END")) {
				break;
			}
			
		}
		System.out.println("game over");
	}

}

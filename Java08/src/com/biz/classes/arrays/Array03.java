package com.biz.classes.arrays;

import java.util.Random;
import java.util.Scanner;

public class Array03 {
	public static void main(String[] args) {
		int[] nums = new int[10];
		Random rnd = new Random();
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(10) + 1;
		}

		System.out.print("1~10 까지중 숫자 한개를 입력 하세요> ");
		String str = scanner.nextLine();
		int sNum = Integer.valueOf(str);
		int index = 0;
		for (index = 0; index < nums.length; index++) {
			if (nums[index] == sNum)
				break;
		}
		if (index >= nums.length)
			System.out.printf("배열에 %d 값 없음\n", sNum);
		else {
			System.out.printf("배열 %d번째에 %d값 있음\n", index, sNum);
			System.out.printf("nums[%d]=%d \n", index, nums[index]);
		}

	}
}

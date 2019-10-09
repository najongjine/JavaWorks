package com.biz.first;

public class Var03 {

	public static void main(String[] args) {
		int intKorGrade=90;
		int intEngGrade=70;
		int intMathGrade=60;
		
		int intSum=0;
		intSum=intEngGrade+intKorGrade+intMathGrade;
		System.out.println("3과목 총점="+(intSum));
		
		intSum=intKorGrade+intMathGrade;
		System.out.println("국어와 수학의 합계="+(int)intSum);

	}

}

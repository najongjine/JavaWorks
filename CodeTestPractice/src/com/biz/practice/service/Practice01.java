package com.biz.practice.service;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BBsService bs=new BBsService(); //bs 라는 이름을 가진 BBsService type의 인스턴스를 만든다.
		List<BBsVO> bbsList=bs.getListAll();//bs인스턴스 안에있는 어떠한 리스트의 주소값을 반환한다.
		for(BBsVO vo:bbsList) {
			System.out.println(vo.getName());//각 리스트안의 요소에있는 이름이라는 필드값을 출력한다.
		}
	}

}

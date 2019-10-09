package com.biz.iolist.exec;

import com.biz.iolist.service.IoListService;
import com.biz.iolist.service.IoListServiceImpV2;
/*
 * 새로운 제품을 팔면서 여러가지 복잡한 계산관계가 생김
 * 
 * 일반미는 단순계산(단가*수량)이면 끝났는데
 * 새 제품은 부가가치세(VAT) 도 계산해야 한다
 * 1.새제품을 위해서 새 프로젝트를 만들어야 할까?
 * 2. 기존에 사용한 클래스를 복붙하여 코드추가를 할까?
 * 
 * 이 문제를 해결하기 위해서 자바는 상속(inheritence) 기능을 제공함.
 * 기존기능+확장기능.
 */
public class IoListEx01 {

	public static void main(String[] args) {
		IoListService ioListService=new IoListServiceImpV2();
		
		
		ioListService.input(5);
		ioListService.view();
	}

}

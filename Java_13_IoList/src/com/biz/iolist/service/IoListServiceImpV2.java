package com.biz.iolist.service;

import com.biz.iolist.model.IoListVO;
/*
 * //부가세별도 금액: 일반 가격을 1.1로 나눈 값
		int amt=(int)(vo.getIntTotalProductPrice() /1.1);
			
		//부가가치세= 일반금액 - 부가세별도금액
		int vat=vo.getIntTotalProductPrice()-amt;
		
		1.1==값에서 10% 정도를 뺀 값
 */
public class IoListServiceImpV2 extends IoListServiceImpV1 {

	@Override
	public void view() {
		System.out.println("-----------------------------------------------------");
		System.out.println("거래일람");
		System.out.println("------------------------------------------------------");
		System.out.println("삼품명\t단가\t수량\t판매액\t부가세\t공급가액\t공금대가");
		System.out.println("-------------------------------------------------------");
		for(IoListVO vo:ioList) {
			System.out.printf("%s\t",vo.getStrProductName());
			System.out.printf("%d\t",vo.getintPerPrice());
			System.out.printf("%d\t",vo.getIntQuantity());
			System.out.printf("%d\t",vo.getIntTotalProductPrice());
			
			//부가세별도 금액: 일반 가격을 1.1로 나눈 값
			int amt=(int)(vo.getIntTotalProductPrice() /1.1);
			
			//부가가치세= 일반금액 - 부가세별도금액
			int vat=vo.getIntTotalProductPrice()-amt;
			System.out.printf("%d\t",vat);
			System.out.printf("%s\t",amt);//공급가액(vat 별도금액)
			System.out.printf("%s\n",vo.getIntTotalProductPrice());
		}
		System.out.println("---------------------------------------------------------");
	}

}

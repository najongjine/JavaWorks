package com.biz.string.exec;
/*
 * 박종진
 * 5만원권은 그냥 계산하고 
 * 나머지 지폐들만 5 2 5 2 의 반복이기 때문에
 * 나머지 지폐 계산부분을 for문에 넣었습니다.
 * 10원 까지만 계산을 할 것이기 때문에 10원보다 큰기를 2번 점검하였습니다.
 */
public class Payment {

	public static void main(String[] args) {
		int pay=3548760;
		int mo=50000;
		int count=50000;
		
		count=(int)(pay/mo); //5만원권
		System.out.println(mo+"원권:"+count);
		pay=pay-count*mo;
		
		for(;mo>0;) {
			
			if(mo>10) {
				mo/=5;
				count=(int)(pay/mo); 
				System.out.println(mo+"원권:"+count);
				pay=pay-count*mo;
				
			}

			if(mo>10) {
				mo/=2;
				count=(int)(pay/mo); 
				System.out.println(mo+"원권:"+count);
				pay=pay-count*mo;
				
			}
		}
		
		/*count=(int)(pay/mo);
		System.out.println(mo+"원권:"+count);// 5만원권
		pay=pay-count*mo;
		
		mo/=5;
		count=(int)(pay/mo); //1만원권
		System.out.println(mo+"원권:"+count);
		pay=pay-count*mo;
		
		mo/=2;
		count=(int)(pay/mo); //5000원권
		System.out.println(mo+"원권:"+count);
		pay=pay-count*mo;
		
		mo/=5;
		count=(int)(pay/mo); //1000원권
		System.out.println(mo+"원권:"+count);
		pay=pay-count*mo;
		
		mo/=2;
		count=(int)(pay/mo); //500원권
		System.out.println(mo+"원권:"+count);
		pay=pay-count*mo;
		
		mo/=5;
		count=(int)(pay/mo); //100원권
		System.out.println(mo+"원권:"+count);
		pay=pay-count*mo;
		
		mo/=2;
		count=(int)(pay/mo); //50원권
		System.out.println(mo+"원권:"+count);
		pay=pay-count*mo;
		
		mo/=5;
		count=(int)(pay/mo); //10원권
		System.out.println(mo+"원권:"+count);
		pay=pay-count*mo;*/
	}

}

package com.biz.pay.exec;

import java.util.List;

import com.biz.pay.domain.PaperVO;
import com.biz.pay.service.PaperMakeServiceV1;
import com.biz.pay.service.PaperPrintServiceV1;
import com.biz.pay.service.PayReadServiceV1;

public class PayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PayReadServiceV1 prs=new PayReadServiceV1();
		PaperMakeServiceV1 pms=new PaperMakeServiceV1();
		String payFile="src/com/biz/pay/pay.txt";
		PaperPrintServiceV1 pps=new PaperPrintServiceV1(payFile);
		
		pps.setPayFile(payFile);
		try {
			pps.viewPaper();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

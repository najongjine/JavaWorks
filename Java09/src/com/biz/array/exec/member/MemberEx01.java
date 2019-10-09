package com.biz.array.exec.member;

import com.biz.array.model.MemberVO;
import com.biz.array.service.MemberService;

public class MemberEx01 {

	public static void main(String[] args) {
		int[] num=new int[10];
		MemberService ms=new MemberService();
		
		MemberVO[] mVOs=ms.getMemverVO();
		/*for(int i=0; i<mVOs.length;i++) {
			System.out.println(mVOs[i].strName);
		}*/
		System.out.println("num hash: "+num.hashCode());
		System.out.println("num[0] hash: "+num[0]);
	}

}

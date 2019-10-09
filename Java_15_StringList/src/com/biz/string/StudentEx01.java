package com.biz.string;

import com.biz.string.domain.StudentVO;
import com.biz.string.service.StringService;
import com.biz.string.service.StudentScoreService;
import com.biz.string.service.StudentServiceV1;

public class StudentEx01 {

	public static void main(String[] args) {
		/*StringService stdService=new StudentServiceV1();
		stdService.input();
		StudentVO stdVO=stdService.view("0001");
		if(stdVO==null) {
			System.out.println("찾는 데이터 없음");
		}else {
			System.out.println(stdVO.toString());
		}*/
		StringService stScService=new StudentScoreService();
		stScService.input();
		stScService.view();
	}

}

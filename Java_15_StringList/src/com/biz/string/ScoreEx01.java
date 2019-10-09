package com.biz.string;

import java.util.List;

import com.biz.string.domain.StudentVO;
import com.biz.string.service.ScoreServiceV2;
import com.biz.string.service.StringService;
import com.biz.string.service.StudentServiceV1;

public class ScoreEx01 {

	public static void main(String[] args) {
		StringService scService=new ScoreServiceV2();
		StringService stdService=new StudentServiceV1();
		
		stdService.input();

		List<StudentVO> stdList=((StudentServiceV1)stdService).getStdList();
		((ScoreServiceV2)scService).setStdList(stdList);
		scService.input();
		scService.list();
	}

}

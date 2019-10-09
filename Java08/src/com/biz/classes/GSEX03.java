package com.biz.classes;

import com.biz.classes.model.GradeScoreVO;
import com.biz.classes.service.GradeScoreService;
/*
 * Code refactoring 한후의 코드
 */
public class GSEX03 {

	public static void main(String[] args) {

		GradeScoreService gService=new GradeScoreService();
		gService.newVO(100);
		gService.makeScore();
		gService.scoreList();
	}

}

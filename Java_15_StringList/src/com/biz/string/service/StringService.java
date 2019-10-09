package com.biz.string.service;

import com.biz.string.domain.StudentVO;

public interface StringService {
	public void input();
	public void list();
	public void view();
	StudentVO view(String strNum);
	
}

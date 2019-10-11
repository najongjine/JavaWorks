package com.biz.lombok.service;

import java.util.List;

import com.biz.lombok.domain.StudentVO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Builder
public abstract class StudentViewServiceABS {
	protected List<StudentVO> stdList;
	
	public abstract void view();
	public abstract void view(String strName);
	public abstract void view(int intGrade);
	
	public abstract void view(int grGrade, int lessGrade);
}

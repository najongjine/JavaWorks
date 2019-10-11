package com.biz.lombok.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.lombok.StudentUtils;
import com.biz.lombok.domain.StudentVO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class StudentReadServiceV1 {
	private List<StudentVO> stdList;
	
	public StudentReadServiceV1() {
		super();
		// TODO Auto-generated constructor stub
		stdList=new ArrayList<StudentVO>();
	}
	public void readStudent(String fileName) throws Exception {
		FileReader fr=new FileReader(fileName);
		BufferedReader buffer=new BufferedReader(fr);
		
		while(true) {
			String reader=buffer.readLine();
			if(reader==null) break;
			if(reader.length()<1) continue;
			String[] _str=reader.split(":");
			String s_num=_str[StudentUtils.NUM];
			String s_name=_str[StudentUtils.NAME];
			String s_tel=_str[StudentUtils.TEL];
			String s_addr=_str[StudentUtils.ADDR];
			int s_grade=Integer.valueOf(_str[StudentUtils.GRADE]);
			String s_dept;
			stdList.add(StudentVO.builder().s_addr(s_addr).s_grade(s_grade).s_grade(s_grade).s_name(s_name)
					.s_num(s_num).s_tel(s_tel).build());
		}
		
		buffer.close();
		fr.close();
	}

}

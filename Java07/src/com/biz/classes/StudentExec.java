package com.biz.classes;

import com.biz.classes.student.Student;

public class StudentExec {

	public static void main(String[] args) {
		Student student01=new Student();
		student01.intEnrolledYear=2018;
		student01.strMajor="컴과";
		student01.strName="김씨";
		student01.strStudentNum="001";
		student01.studentList();
		student01.studentPersonalInfo();

	}

}

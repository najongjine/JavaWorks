package com.biz.lombok.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
/*
 * lombok.jar(롬복프로젝트)
 * domain, model class에서 getter,setter,tostring,constr
 * 등의 코드를 번거롭게 작성할 필요없이 자동으로 생성해주는 3rd party lib.
 * 
 * eclipse와 같은 IDE에서는 일단 agent(plugin)을 설치해주고
 * 프로젝트에서는 builder path에서 lombok.jar 파일을 add해서 사용할수 있다.
 */
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * Annotation:= Java 확장 키워드
 * @keyword라고 작성하면 Java 컴파일러는 해당 키워드로 작성된 클래스를 가져다가 코드를
 * 완성해서 컴파일을 시켜준다.
 */
//@Data  모든 @들을 포함하지만, 너무많은 함수들이 포함되서 눈만아픔.
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentVO {
	private String s_num;
	private String s_name;
	private String s_tel;
	private  String s_addr;
	private int s_grade;
	private String s_dept;
}

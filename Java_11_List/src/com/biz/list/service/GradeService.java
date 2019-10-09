package com.biz.list.service;
/*
 * interface class:= 모양같은 설계도. 시제품
 * 1. 메서드들을 정의하는 문장만 있다.
 * 2.메서드는 실제 작동되는 코드가 한줄도 없다
 * 3.메서드는 코드를 작성하는 {} 없다.
 * 4. 혼자는 아무런 기능도 수행하지 않는다
 * 5. 다른 클래스를 작성하는데 설계도 역확을 한다.
 * 6. interface를 implement 한 클래스는 여기에 정의된 method를 반드시 구현 해야 한다.
 */
public interface GradeService {
	
	public void input(int size);
		
	public void view();
		
	public void total();
		
}

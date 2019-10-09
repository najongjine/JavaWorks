package com.biz.classes.service.parents;
/*
 * abstract class: 추상클래스
 * 클래스는 클래스인데 미완성된 모양만 클래스.
 * 부모 클래스로서 역활을 수행하는 클래스.
 *  부모클래스:주요 기능을 미리 만들어 두고, 상속받은곳에서
 *  method의 기능을 사용하도록 하는 것.
 *  변수들도 선언해두고 상속 받은곳에서 사용 가능하도록 하는 것.
 * 인터페이스의 역활도 수행하는 클래스
 *  아직 주요기능을 구현하지는 않았지만, 꼭 필요하니 구현하라는 설계도 역활.
 *  
 *  일반 클래스이며 인터페이스인 클래스
 */
public abstract class RemoconABS {
	protected String name;

	public RemoconABS() {
		super();
		// TODO Auto-generated constructor stub
		name="나는 리모콘 입니다";
	}
	public void power() {
		System.out.println(name);
	}
	public void volUP() {
		System.out.println("볼륨 올리기");
	}
	public abstract void volDown();
	public abstract void chUP();
	public abstract void chDown();
}

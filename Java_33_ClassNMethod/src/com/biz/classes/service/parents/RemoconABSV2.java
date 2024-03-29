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
 *  부모클래스에서 기능을 만들어 자식 클래스에 물려줄때는
 *  method 코드를 모두 구현을 하고
 *  	기능구현을 자식클래스에 일임을 하고자 할때는 absract method를 선언하여
 *  	method 코드 없이 만들어만 둔다.
 *  
 *  자식클래스에서는 부모클래스에 선언된 abstract method는 반드시 method 원형(prototype)
 *  이라도 생성을 해 두어야만 한다.
 *  즉, 부모클래스에서는 아직 구현되지 않았지만 상속받은 자식 클래스에서 꼭!!! 만들어 주기를
 *  바라는 method를 미리 정의해 두는 것이다.
 */
public abstract class RemoconABSV2 {
	protected String name;

	public RemoconABSV2() {
		super();
		// TODO Auto-generated constructor stub
		name="나는 리모콘 입니다";
	}
	public void power() {
		System.out.println(name);
	}
	public abstract void volUp();
	public abstract void volDown();
	public abstract void chUp();
	public abstract void chDown();
	public abstract void setName(String string);
}

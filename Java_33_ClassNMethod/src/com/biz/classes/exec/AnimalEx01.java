package com.biz.classes.exec;

import com.biz.classes.service.children.Cat;
import com.biz.classes.service.children.Dog;
import com.biz.classes.service.parents.Animal;

public class AnimalEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal am=new Animal();
		String name=am.getName();
		System.out.println(name);
		
		Dog dog1=new Dog();
		dog1.setName();
		name=dog1.getName();
		System.out.println(name);
		
		Cat cat1=new Cat();
		cat1.setName();
		name=cat1.getName();
		System.out.println(name);
	}

}

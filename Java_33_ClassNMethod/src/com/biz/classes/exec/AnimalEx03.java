package com.biz.classes.exec;

import com.biz.classes.service.children.Cat;
import com.biz.classes.service.children.Dog;
import com.biz.classes.service.parents.Animal;

public class AnimalEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal am=new Animal();
		Dog dog1=new Dog();
		Cat cat1=new Cat();
		
		viewName(am);
		
		cat1.setName();
		viewName(cat1);
		
		dog1.setName();
		viewName(dog1);
	}
	public static void viewName(Animal animal) {
		String name=animal.getName();
		System.out.println("Animal: "+name);
	}
	/*public static void viewName(Dog dog) {
		String name=dog.getName();
		System.out.println("Dog:" +name);
	}*/
	public static void viewName(Cat cat) {
		String name=cat.getName();
		System.out.println("Cat: "+name);
	}
}

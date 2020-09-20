package tutorial44_Serialization;

import java.io.Serializable;

public class Person implements Serializable {
	
	private static final long serialVersionUID = 2311042996156453879L;
	
	private String name;
	private int age;
	private static int count;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		count++;
		showInfo();
	}
	
	public void getName() {
		System.out.println("Person's name is " + name);
	}
	
	public void showInfo() {
		System.out.println("************");
		System.out.println("Name: " + name + "\nAge: " + age + "\nTotal people: "+ count);
		System.out.println("************");
	}
}

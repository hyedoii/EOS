package week4;

public class PhoneBook {
	
	String name;
	int age, sexual;

	PhoneBook(String name){
		this.name = name;
	}
	PhoneBook(String name, int age){
		this(name);
		this.age = age;
	}
	PhoneBook(String name, int age, int sexual){
		this(name, age);
		this.sexual = sexual;
	}
	

}


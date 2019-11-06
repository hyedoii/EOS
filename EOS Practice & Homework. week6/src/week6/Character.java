package week6;

abstract class Character implements Characters{
	
	String name;
	int stat;
	
	Character(String name, int stat){
		this.name = name;
		this.stat = stat;
	}

}

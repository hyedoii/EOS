package week3;

public class StudentInfo{
		static boolean life = true;
		public String name;
		boolean man;
		int age;
		StudentInfo(String name){
			this.name=name;
		}
		StudentInfo(String name, int age){
			this(name);
			this.age=age;
		}
		StudentInfo(String name, int age, boolean man){
			this(name, age);
			this.man=man;
		}
		public int getAge(){
			return age;
		}
		public boolean getMan(){
			return man;
		}
		public String getName(){
			return name;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo alice = new StudentInfo("Alice", 21);
		System.out.println(alice.getAge());
	}

}

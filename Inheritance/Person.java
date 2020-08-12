package lab1;

public class Person {
	
	String name;
	int age;
	
	/*Person(){
		name=null;
		age=0;
	}*/
	public Person(String name, int age) {
		super();
		System.out.println("in person constructor");
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

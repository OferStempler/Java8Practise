package ofer.stempler.methodRef.custom;

public class Person {
	private  String name;
	private int age;
	
	public Person(){}
	
	public Person(String name, int age) {
		super();
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
		return name + "-" + age;
	}
	
	
	//NOTE: method signature matches IncrementByOne.increment() method
	public int birthday(){
		this.age+=1;
		return this.age;
	}
}

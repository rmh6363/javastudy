package kr.co.ezen;

public class Cat {
	private String name;
	private int age;
	
	public Cat() {
		name = "°í¾çÀÌ";
		age = 3;
	}
	public Cat(String name) {
		this.name = name;
	}
	public Cat(int age) {
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
	


}


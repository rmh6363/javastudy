package kr.co.ezen;

public class Dog {
	private String birth;
	private int age;
	private String name;
	private int tel;
	
	
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public Dog(String birth, int age, String name, int tel) {
		super();
		this.birth = birth;
		this.age = age;
		this.name = name;
		this.tel = tel;
	}
	
}

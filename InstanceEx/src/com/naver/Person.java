package com.naver;

import kr.co.ezen.Dog;

public class Person {
	private String id;
	private String name;
	private Dog happy;
	private Car k7;
	
	

	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String id, String name, Dog happy, Car k7) {
		super();
		this.id = id;
		this.name = name;
		this.happy = happy;
		this.k7 = k7;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dog getHappy() {
		return happy;
	}
	public void setHappy(Dog happy) {
		this.happy = happy;
	}
	public Car getK7() {
		return k7;
	}
	public void setK7(Car k7) {
		this.k7 = k7;
	}
	public void sleep(String where) {
		String msg= happy.sleep(where);
		System.out.println(msg);
	}
	public void run(int speed) {
		String msg2 = k7.run(speed);
		System.out.println(msg2);
		
	}
	public void printCarPrice() {
		k7.showMePrice();
		
	}
	
	

}

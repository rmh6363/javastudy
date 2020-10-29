package com.naver;

public class Person {
	private TV tv1;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(TV tv1) {
		super();
		this.tv1 = tv1;
	}
	public TV getTv1() {
		return tv1;
	}
	public void setTv1(TV tv1) {
		this.tv1 = tv1;
	}
	public void tvOn() {
		System.out.println("tv¸¦ Ä×´Ï´Ù");
		tv1.powerOn();
	}
	public void tvOff() {
		System.out.println("tv¸¦ ²ü´Ï´Ù");
		tv1.powerOff();
	}
	

}

package com.naver;

public class Weapon {
	private int power;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Weapon() {
		// TODO Auto-generated constructor stub
	}
	public void attack(Monster mon) {
		int bHp = mon.getHp();
		int aHp = bHp-power;
		mon.setHp(aHp);
		System.out.println("monster�� Hp : "+ aHp);
	}
	
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public Weapon(int power) {
		super();
		this.power = power;
	}
	public Weapon(int power, String name) {
		super();
		this.power = power;
		this.name = name;
	}
	@Override
	public String toString() {
		return getName();	
	}

}

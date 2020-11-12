package com.naver;

public  class Weapon {
	private String name;
	private int power;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public Weapon(String name, int power) {
		super();
		this.name = name;
		this.power = power;
	}
	public void attack(Monster mon) {
		int bhp = mon.getHp();
		int ahp = bhp - power;
		mon.setHp(ahp);
		System.out.println("monster¿«hp : "+ahp);
				
	}
	@Override
	public String toString() {
		return getName();
		
	}
	
	
	}



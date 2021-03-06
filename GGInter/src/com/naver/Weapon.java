package com.naver;

public abstract class Weapon implements WeaponSkill {
	String name;
	int power;
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
	
	public final void attack(Monster mon) {
		img();
		int bhp = mon.getHp();
		int ahp = bhp -power;
		mon.setHp(ahp);
		System.out.println("monster�� hp : "+ahp);
	}
	public abstract void name();
	public abstract void power();
	
	public String toString() {
		return getName();
	}

}

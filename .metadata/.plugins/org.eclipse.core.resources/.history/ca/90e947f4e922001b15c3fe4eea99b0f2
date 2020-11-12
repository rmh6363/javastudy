package com.naver;

public class Hero {
	Weapon[] weapons;
	Weapon w;
	
	public void attack(Monster mon) {
		w.attack(mon);
	}
	public void changeWeapon(int weaponidx) {
		if(weaponidx >= weapons.length || weaponidx <0) {
			weaponidx = weapons.length-1;
		}
		w = weapons[weaponidx];
		System.out.println(w+ "으로 교체합니다.");
	}

	public Hero(Weapon[] weapons, Weapon w) {
		super();
		this.weapons = weapons;
		this.w = w;
	}
	
}

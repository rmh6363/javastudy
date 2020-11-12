package com.naver;

public class Hero {
	Weapon[] Weapons;
	Weapon w;

	public Hero() {

	}

	

	public void attack(Monster mon) {
		w.attack(mon);
	}

	public void changeWeapon(int weaponidx) {
		if (weaponidx >= Weapons.length || weaponidx < 0) {
			weaponidx = Weapons.length - 1;
		}
		w = Weapons[weaponidx];
		System.out.println(w + "로 변경되었습니다.");
	}

	public Hero(Weapon[] weapons, Weapon w) {
		super();
		Weapons = weapons;
		this.w = w;
	}

}

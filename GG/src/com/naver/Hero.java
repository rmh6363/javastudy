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
		try {
			w = Weapons[weaponidx];
		} catch (Exception e) {
			weaponidx = Weapons.length-1;
		}
		System.out.println(w + "�� ����Ǿ����ϴ�.");
	}

	public Hero(Weapon[] weapons, Weapon w) {
		super();
		Weapons = weapons;
		this.w = w;
	}

}

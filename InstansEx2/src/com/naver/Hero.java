package com.naver;

public class Hero {
	private Bow bow;
	private Spear spear;


	public Hero() {
		// TODO Auto-generated constructor stub
	}

	public Bow getBow() {
		return bow;
	}

	public void setBow(Bow bow) {
		this.bow = bow;
	}

	public Spear getSpear() {
		return spear;
	}

	public void setSpear(Spear spear) {
		this.spear = spear;
	}

	public Hero(Bow bow, Spear spear) {
		super();
		this.bow = bow;
		this.spear = spear;
	}

	public Hero(Spear spear) {
		super();
		this.spear = spear;
	}

	public Hero(Bow bow) {
		super();
		this.bow = bow;
	}

	public void attack(Monster mon) {
		bow.attack(mon);
	

	}
	public void attack(Sword sword, Monster mon) {
		sword.attack(mon);
	}
	public void attackBySpear(Monster mon) {
		spear.attack(mon);
	}

	

	
	}


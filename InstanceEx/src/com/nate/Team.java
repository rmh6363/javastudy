package com.nate;

import com.naver.Car;
import com.naver.Person;

import kr.co.ezen.Dog;

public class Team {
	private Person captain;
	private Person member1;
	private Person member2;

	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(Person captain, Person member1, Person member2) {
		super();
		this.captain = captain;
		this.member1 = member1;
		this.member2 = member2;
	}

	public Person getCaptain() {
		return captain;
	}

	public void setCaptain(Person captain) {
		this.captain = captain;
	}

	public Person getMember1() {
		return member1;
	}

	public void setMember1(Person member1) {
		this.member1 = member1;
	}

	public Person getMember2() {
		return member2;
	}

	public void setMember2(Person member2) {
		this.member2 = member2;
	}

	public void showCaptainCarPrice() {
		Car captaincar = captain.getK7();
		captaincar.showMePrice();
	}

	public void mem1Sleep(String where) {
		String d2 = member1.getHappy().sleep("방");
		System.out.println(d2);
	}

	public void mem2PrintCarModelName() {
		String md = member2.getK7().getModelName();
		System.out.println(md);
		member2.getK7().getModelName();

	}

	public char getCaptainCarModelNameFirstChar() {
		char a = captain.getK7().getModelName().toString().charAt(0);
		return a;

	}

	public void changeMem1Dog(Dog dog) {
		member1.setHappy(dog);

	}

	public void changeMem1DogName(String name) {
		member1.getHappy().setName(name);
	}

	public void fight(Team otherTeam) {
		String a = this.captain.getName();
		String b = otherTeam.captain.getName();
		System.out.println(a + "와" + b + "이 싸웁니다.");

	}

	public void fightMem1(Team otherTeam) {
		String bTeamName = this.member1.getName();
		String aTeamName = otherTeam.member1.getName();
		System.out.println(bTeamName + "와" + aTeamName + "이싸웁니다.");
	}

	public void fightmem2Dog(Team otherTeam) {
		String m2 = this.member2.getHappy().getName();
		String m3 = otherTeam.member2.getHappy().getName();
		System.out.println(m2 + "와" + m3 + "가 개싸움을 합니다.");
	}

	public void racingCap(Team otherTeam) {
		String car1 = this.captain.getK7().getModelName();
		String car2 = otherTeam.captain.getK7().getModelName();
		System.out.println(car1 + "과" + car2 + "가 레이싱을 합니다");

	}

	public void racingMem2(Team otherTeam) {
		String carM1 = this.member2.getK7().getModelName();
		String carM2 = otherTeam.member2.getK7().getModelName();
		System.out.println(carM1 + "와" + carM2 + "가 레이싱을 합니다");

	}
	
	
	
	
}




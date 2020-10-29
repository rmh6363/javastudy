package com.naver;

public class ElseIfEx {
	private int age;

	public ElseIfEx() {
		age = 22;
	}

	public void name() {
		if (age >= 20 && age < 30) {
			System.out.println("20��");
		} else if (age < 20) {
			System.out.println("10�� ����");
		} else {
			System.out.println("30�� �̻�");
		}
	}

	public String GradeCheck(int score) {
		if (score >= 90) {
			return "A";
		} else if (score >= 80 && score < 90) {
			return "B";
		} else if (score >= 70 && score < 80) {
			return "C";
		} else if (score >= 60 && score < 70) {
			return "D";
		} else {
			return "F";
		}
	}

}

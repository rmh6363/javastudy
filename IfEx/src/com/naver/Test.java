package com.naver;

public class Test {

	public Test() {

	}

	public char me7(int score) {
		if (score >= 90) {
			return '수';
		} else if (score >= 80) {
			return '우';
		} else if (score >= 70) {
			return '미';
		} else if (score >= 60) {
			return '양';
		} else {
			return '가';
		}

	}

	public void me6(int a) {
		if (a % 2 == 0) {
			System.out.println(2);
		} else if (a % 3 == 0) {
			System.out.println(3);
		} else if (a % 5 == 0) {
			System.out.println(5);
		} else {
			System.out.println(0);
		}
	}

	public void me5(int x) {
		if (x < 0) {
			System.out.println(3);
		} else {
			System.out.println(-3);
		}

	}

	public void me2(int a) {
		if (a % 5 == 0 && a % 6 == 0) {
			System.out.println(30);
		}

	}

	public void me1() {
		int a = 10;
		if (a % 5 == 0) {
			System.out.println(5);
		}

	}

}

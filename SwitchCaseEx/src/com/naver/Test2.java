package com.naver;

public class Test2 {
	public Test2() {
		// TODO Auto-generated constructor stub
	}

	public char rank(int rank) {
		char c = 'a';
		switch (rank) {
		case 1:
			c = '±İ';
			break;

		case 2:
			c = 'Àº';
			break;

		default:
			c = 'µ¿';

		}
		return c;

	}

	public void name() {
		for(int i = 0; i<10; i++) {
			System.out.println("hello world");
		}
	}

}

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
	public void rank() {
		int a = 3;
		if(a > 0) {
			rank();
		}
	}

}

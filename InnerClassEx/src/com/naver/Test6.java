package com.naver;

public class Test6 {
	public Test6() {
		new Inter1() {

			@Override
			public void me1() {
				System.out.println(11111);

			}
		}.me1();
		

	}

}

package com.naver;

public class K7 extends Car {
	public K7() {
		// TODO Auto-generated constructor stub
		run();
	}

	public K7(String model, String name, int price) {
		super(model, name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println("K7ÀÇ run()");
		
	}
	
}

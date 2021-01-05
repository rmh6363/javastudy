package com.naver;

public class Sonata extends Car {
	private String model = "sonata";
	
	public Sonata() {
		run();
	
		
	}

	public Sonata(String model, String name, int price) {
		super(model, name, price);
	}
	
	public void me1() {
		System.out.println(getModel());
		
	}

	@Override
	public void run() {
		System.out.println(":::::::::::::::::::::::::::");
		System.out.println("sonata 클래스의 run()");
		System.out.println(":::::::::::::::::::::::::::");
	}
	public void only() {
		System.out.println("부모클래스에는 없고, 소나타클래스에만 있는 메서드");
	}

}

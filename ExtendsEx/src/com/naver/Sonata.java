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
		System.out.println("sonata Ŭ������ run()");
		System.out.println(":::::::::::::::::::::::::::");
	}
	public void only() {
		System.out.println("�θ�Ŭ�������� ����, �ҳ�ŸŬ�������� �ִ� �޼���");
	}

}

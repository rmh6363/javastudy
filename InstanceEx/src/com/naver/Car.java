package com.naver;

public class Car {
	private String modelName;
	private String carNo;
	private int price;
	
	public Car() {
		
	}
	public void showMePrice() {
		System.out.println(price);
	}
	public String run(int speed) {
		speed = 200;
		String msg = speed + "으로 달린다";
		return msg;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Car(String modelName, String carNo, int price) {
		super();
		this.modelName = modelName;
		this.carNo = carNo;
		this.price = price;
	}

}

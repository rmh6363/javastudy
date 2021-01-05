package com.naver;

public class Car {
	public String model;
	private String company;
	private int price;
	
	public Car() {
		
	}
	public void run() {
		System.out.println("Car클래스의 rum();");
	}
	
	

	public Car(String model, String name, int price) {
		super();
		this.model = model;
		this.company = name;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return company;
	}

	public void setName(String name) {
		this.company = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public void k1() {
		
	}
	public void k2() {		
		
	}
	public void k3() {		
		
	}
	public void k4() {
		
	}
	public void k5() {
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	


}

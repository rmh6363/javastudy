package com.naver;

import kr.co.ezen.Dog;

public class DogRegistManagementService {
	private Dog dog;
	
	public DogRegistManagementService() {
		
		
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public Dog makeDog(String name, int age) {
		
		Dog d = new Dog();
		d.setName(name);
		d.setAge(age);
		
		return d;
		
		
	}
		
	

}

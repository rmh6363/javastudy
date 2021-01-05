package com.naver;

import kr.co.ezen.Cat;

public class CatService {
	private Cat cat;
	public CatService() {
		
	}
	public Cat getCat() {
		return cat;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	public Cat makeCat(String name,int age) {
		
		Cat c = new Cat();
		c.setAge(age);
		c.setName(name);
		return c;
		
	}
	
}
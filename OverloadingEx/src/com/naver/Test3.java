package com.naver;

public class Test3 {
	public void printDa() {
		System.out.println("메서드 오버로딩");
		
	}
	public void printDa(int a) {
		System.out.println(a);
		
	}
	public void printDa(long a) {
		System.out.println(a);
	}
	public void printDa(Dog a) {
		System.out.println(a);
	}
	public void printDa(Cat a) {
		System.out.println(a);
	}

}

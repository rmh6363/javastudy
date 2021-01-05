package com.naver;

public class Test2 {
	private int a;
	private boolean b = false;
	//&&는 모두 true 일때만 true 표시 하나라도 false면 false가됌 ||는 이 반대 논리연산자!는 값을 반전시킴
	public void k1(boolean a, boolean b){
		boolean result = a && b;
		System.out.println(result);
	
	}
	public void k2(boolean a, boolean b) {
		boolean result = a||b;
		System.out.println(result);
	}
	public void k3(boolean a) {
		System.out.println(!a);
		System.out.println(a);
	}
	public void swicthInt() {
		a = 1-a;
		System.out.println(a);
	
	}
	public void switchBoolean() {
		b = !b;
		System.out.println(b);
	}
	

}

package com.naver;

public class Test3 {
	private int a;
	private int b;
	public Test3() {
		a = 0;
		b = 0;
		//++이 변수 앞에 오면, 변수의 값이 1만큼 증가합니다. 그리고 그 증가된 값은 곧바로 변수에 대입됩니다.
		//++이 변수 뒤에 오면, 변수의 값이 1만큼 증가합니다. 그러나 그 증가된 값은 나중에 해당 변수를 호출할 때 대입됩니다
	}
	public void plus1() {
		System.out.println(a);
		++a;
		System.out.println(a);
		
	}
	public void plus11() {
		System.out.println(++a);
		
	}
	public void plus2() {
		System.out.println(b);
		b++;
		System.out.println(b);
	}
	public void plus21() {
		System.out.println(b++);
		
		
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void minus1() {
		System.out.println(--a);
	}

}

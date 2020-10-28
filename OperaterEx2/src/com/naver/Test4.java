package com.naver;

public class Test4 {
	//조건연산자      변수명 = 조건식? 참일때의 값 변수 반환형이있는 메소드 : 거짓일때의 값 변수 반환형있는 메소드;
	private int a;
	private int b;
	boolean c;
	public Test4() {
		a = 4;
		b = 11;

	}
	public void con1() {
		char c = a >= b? 'a': 'z';
		System.out.println(c);
	}
	public void con3() {
	    StringBuffer c = a >= b? new StringBuffer("hello"):new StringBuffer("no"); 
	    System.out.println(c);
	}
	public int me1() {
		return 3;
		
	}
	public void me2() {
		System.out.println(44);
	}
	public void cond4() {
		int c = a < b*2? me1() : a;
		System.out.println(c);
	}
	public void con5(int score) {
		char c = score >= 90? 'A'
				: score >= 80? 'B'
						: score >= 70 ? 'c' 
								: score >= 60 ? 'D' 
										: 'F' ;
        System.out.println(c);   
	}

		
}

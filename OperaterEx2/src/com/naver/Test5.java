package com.naver;

public class Test5 {
	private int a = 14;
	private int b = 28;
    //  비트연산자 : & | ^ ~(부호반전: 양수 -> 음수일 때는 +1,음수 -> 양수일 때는 -1)
    //  시프트연산자 : >>  <<
	
	public void h1() {
		int c = b & a;
		System.out.println(c);
	}
	public void h2() {
		int c = b | a;
		System.out.println(c);
	}
	public void h3() {
		int c = b ^ a;
		System.out.println(c);
	}
	public void h4() {
		int c = ~a;
		System.out.println(c);
		
	}
	public void h5(int n) {
		System.out.println(14 >> n);
		
	}
	public void h6(int n) {
		System.out.println(3 << n);
	}

}

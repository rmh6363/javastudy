package com.naver;

public class Test {
	public int a;
	public static int b;
	
	public void me2() {
		System.out.println(a);
		System.out.println(Test.b);
	}
	public static void me1() {
		Test t1 = new Test();
		System.out.println(t1.a);
		System.out.println(Test.b);
	}
	
	

}

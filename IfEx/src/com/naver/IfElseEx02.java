package com.naver;

public class IfElseEx02 {
	private int a;
	private int b;
	private int c;
	private int max;
	public IfElseEx02() {
		a = 10;
		b = 20;
		c = 9;
		
	}
	public void name() {
		if(a > b && a > c) {
			max = a;
		}else {
			if(b > c) {
				max = b;
			}else {
				max = c;
			}
			
		}
		System.out.println("max ="+max);
	}

}

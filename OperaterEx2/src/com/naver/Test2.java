package com.naver;

public class Test2 {
	private int a;
	private boolean b = false;
	//&&�� ��� true �϶��� true ǥ�� �ϳ��� false�� false���� ||�� �� �ݴ� ��������!�� ���� ������Ŵ
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

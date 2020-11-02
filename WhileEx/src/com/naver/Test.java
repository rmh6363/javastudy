package com.naver;

public class Test {

	public void plus(int num) {
		for (int i = 1; i < 10; i++) {
			System.out.println(num + "x" + i + "=" + i * num);
		}
	}

	public void f(int num,int num2) {
		for (int i = 1; i < num + 1; i++) {
			if (num % i == 0) {
				System.out.println(i);}
		}}
	
		

	public void na() {
		int a = 1;
		int b = 1;
		for (int i = 0; i < 25; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}

	public void me5() {
		int i = 0;
		while (i < 10) {
			if (i != 0 && i % 5 == 0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

	public void me4() {
		int i = 0;
		while (i < 10) {
			if (i != 0 && i % 5 == 0) {
				break;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("me4()³¡");
	}

	public void name() {
		int i = 0;
		while (i < 27337) {
			System.out.println(i);
			i = i + 3;
		}
	}

	public void r() {
		int a = 1;
		int b = 1;
		for (int i = 0; i < 15; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}

	public void star(int n) {
		int i = 0;
		while (i < n) {
			me31(i + 1);
			i++;
		}
	}

	public void gugudan() {
		int i = 2;
		while (i < 10) {
			System.out.println(i + "´Ü:::::::::");
			dan(i);
			i++;
		}
	}

	public void me31(int n) {
		int i = 0;

		while (i < n) {
			System.out.print('*');
			i++;
		}
		System.out.println();
	}

	public void me3() {
		int i = 0;
		while (i < 10) {
			System.out.print("*");
			i++;
		}
		System.out.println();
	}

	public void dan(int dan) {
		int i = 1;
		while (i < 10) {
			StringBuffer sb = new StringBuffer();
			sb.append(dan);
			sb.append("X");
			sb.append(i);
			sb.append("=");
			sb.append(dan * i);
			System.out.println(sb.toString());
			i++;
		}
	}

	public void me21() {
		int i = 99;
		while (i >= 21) {
			System.out.println(i);
			i = i - 2;
		}
	}

	public void me1() {
		int i = 0;

		while (i < 101) {
			System.out.println(i);
			i++;
		}
		int j = 100;
		while (j >= 0) {
			System.out.println(j);
			j--;
		}
	}

	public void me2() {
		int i = 0;
		while (i < 47) {
			System.out.println(i);
			i = i + 2;

		}

	}

}

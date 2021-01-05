package com.naver;

public class Test2 {
	public void dan(int n) {
		for (int i = 1; i < 10; i++) {
			int a = i * n;
			System.out.println(n + "x" + i + "=" + a);
		}
	}

	public void gugudan() {
		for (int i = 2; i < 10; i++) {
			dan(i);

		}
	}

	public void me() {
		for (int i = 0; i < 50; i++) {
			int a = i * 2 + 1;
			System.out.println(a);
		}
	}

	public void sosu(int num) {
		for (int i = 2; i < num + 1; i++) {
			if (num % i == 0)
				if (num == i) {
					System.out.println("소수");
				} else {
					System.out.println("소수가 아님");
					break;
				}

		}

	}

	public void name() {
		for (int i = 0; i < 51; i++) {
			int a = i * 2;
			System.out.println(a);
		}
	}

	public void name2() {
		for (int i = 0; i < 50; i++) {
			int a = i * 2 + 1;
			System.out.println(a);
		}
	}

}

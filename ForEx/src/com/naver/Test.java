package com.naver;

public class Test {
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public void halfDiamond() {
		int n = 10;

		for (int i = 0; i < n; i++) {
			if (i < n / 2) {
				me5(i + 1);
			} else {
				me5(n - i - 1);
			}
		}
	}

	public void printStar(int n) {

		for (int i = 0; i < n; i++) {
			me5(i + 1);
		}
	}

	public void star() {
		for (int i = 0; i < 5; i++) {
			me5(i + 1);
		}

	}

	public void gugudan() {
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단>>>>>>>>>>>");
			dan(i);
		}
	}

	public void me5(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print('*');
		}
		System.out.println();
	}

	public void me5() {
		for (int i = 0; i < 10; i++) {
			System.out.print("*");
		}
		System.out.println();

	}

	public void isSossu(int num) {
		for (int i = 2; i < num + 1; i++) {
			if (num % i == 0)
				if (num == i) {
					System.out.println("소수입니다");
				} else {
					System.out.println("소수가 아닙니다");
					break;
				}
		}

	}

	public void dan(int dan) {
		for (int i = 1; i < 10; i++) {
			int a = i * dan;
			System.out.println(dan + "x" + i + "=" + a);
		}
	}

	public void me1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("hello world");
		}
	}

	public void me2() {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
	}

	public void me3() {
		for (int i = 0; i < 51; i++) {
			i = i * 2;
			System.out.println();

		}
	}

	public void me4() {
		for (int i = 0; i < 51; i++) {
			int a = i * 2 + 1;
			System.out.println(a);
		}

	}

	public void me4(int n) {
		for (int i = 0; i < n; i++) {
			int a = i * 2 + 1;
			System.out.println(a);

		}
	}

	public void me6() {
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
	}

	public void ss(int num) {
		for (int i = 2; i < num + 1; i++) {
			if (num % i == 0)
				if (num == i) {
					System.out.println("소수");
				} else {
					System.out.println("소수가아님");
					break;
				}
		}
	}

	public void name1(int dan) {
		for (int i = 1; i < 10; i++) {
			int a = i * dan;
			System.out.println(dan + "x" + i + "=" + a);
		}
	}

	public void name3() {
		for (int i = 2; i < 10; i++) {
			name1(i);

		}

	}
}

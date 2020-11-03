package com.naver;

import java.util.Arrays;

public class Test {

	public Test() {

	}

	public int[] me01() {
		int[] arrInt = { 3, 6, 3, 7 };
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
		return arrInt;
	}

	public void me0() {
		// 1. 반복문 사용을 위해서
		// 2. 여러 개의 데이터를 반환하기 위해서.

	}

	public void me33() {
		int[] score = new int[10];
		for (int i = 0; i < score.length; i++) {
			score[i] = i;
		}
		System.out.println(Arrays.toString(score));

	}

	public void me32(Dog[] dogs) {
		int size = dogs.length;
		System.out.println(size);
	}

	public void me31() {
		float[] arrFloat = new float[] { 3.14F, 4.2F, 9.8F };
		System.out.println(arrFloat.length);
	}

	public void me3() {
		// 배열 생성 세번째 방법
		int[] arrInt = new int[] { 1, 3, 5, 7 };
		System.out.println(arrInt.length);
		arrInt[arrInt.length - 1] = 0;

		System.out.println(arrInt[3]);

	}

	public void me22(String[] arrStr) {
		System.out.println(arrStr.length);
		arrStr[1] = "12";
		System.out.println("!!!!!!!!!!!!!!!!!");
		String s1 = arrStr[1];

		System.out.println(s1);
		// 같음
		System.out.println(arrStr[1]);

	}

	public void me21() {
		Dog[] arrDog = { new Dog(), new Dog() };
		System.out.println(arrDog.length);
		arrDog[arrDog.length - 1] = null;
		for (int i = 0; i < arrDog.length; i++) {
			System.out.println(arrDog[i]);
		}
		if (arrDog[1] != null) {
			System.out.println(arrDog[1].getName());
		}
	}

	public void me2() {
		// 배열생성 두번째 방법
		// 자료형[] 배열명 = {값1,값2,값3.....}
		int[] arrInt = { 1, 4, 6 };
		System.out.println(arrInt.length);
		System.out.println("::::::::::::::");
		System.out.println(arrInt[1]);
		arrInt[1] = 333;
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]);

		}
		for (int i = 0; i < arrInt.length; i++) {
			if (i == 1) {
				continue;
			} else {
				System.out.println(arrInt[i]);
			}

		}
		for (int i = 0; i < arrInt.length; i++) {
			if (arrInt[i] == 6) {
				continue;
			}
			System.out.println(i);
		}

	}

	public void me13() {
		String data = "teacheroy#1#seoul#226-1";
		String[] arrData = data.split("#");
		System.out.println(arrData.length);

		arrData[arrData.length - 1] = "100";
		arrData[0] = "ezen";

		for (int i = 0; i < arrData.length; i++) {
			System.out.println(arrData[i].charAt(0));
		}
		for (int i = 0; i < arrData.length; i++) {
			System.out.println(arrData[i]);
		}

	}

	public void me12(Dog[] dogs) {
		System.out.println(dogs.length);
		int largestIdx = dogs.length;
		dogs[largestIdx - 1] = null;
		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i]);

		}
		for (int i = 0; i < dogs.length; i++) {
			Dog dog = dogs[i];
			if (dog != null) {
				System.out.println(dogs[i].getName());
			}

			// System.out.println(dogs[i].getName());
		}

	}

	public void me11() {
		// 배열 생성 첫번째 방법
		StringBuffer[] arrsb = new StringBuffer[100];
		System.out.println("#####################");
		System.out.println(arrsb[50]);
		StringBuffer sb1 = new StringBuffer();
		arrsb[1] = sb1;

		System.out.println("#######################");
		System.out.println(arrsb.length);

		for (int i = arrsb.length - 1; i >= 0; i--) {
			System.out.println(arrsb[i]);
		}

	}

	public void me1() {
		int[] arrInt = new int[4];
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i;
		}
		for (int i = 0; i < arrInt.length; i++) {
			int a = i * 2;
			arrInt[i] = a;
		}
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i * 2 + 1;
		}
		int a = 1;
		int b = 1;
		int[] arrInt2 = new int[100];
		for (int i = 0; i < arrInt2.length; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;

		}

		arrInt[0] = 100;
		arrInt[1] = 200;
		arrInt[2] = 300;
		arrInt[3] = 400;
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}

	}

	public void name() {
		int[][] arr = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}

	public void gugudan() {
		int arr[][] = new int[10][10];
		for (int i = 2; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				arr[i][j] = i * j;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void name2() {
		int arr[][] = { 
				{ 0, 1, 2, 3 }, 
				{ 4, 5, 6, 7 }, 
				{ 8, 9, 10, 11 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

	}
	public void name3() {
		
	}

}

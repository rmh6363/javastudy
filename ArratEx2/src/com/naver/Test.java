package com.naver;

public class Test {
	
	
	
	public void me5() {
		int[][] arr = new int[3][];
		arr[0] = new int[] {1,2,3,4};
		arr[1] = new int[] {0,2,4};
		arr[2] = new int[] {1,3,5,7,9};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
		}System.out.println();
	}
	
	public void me4() {
		int[][] arr= new int[3][10];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i == 0) {
					arr[i][j]=i+1;
				}else if(i == 1) {
					arr[i][j] = i*2;
				}else {
					arr[i][j]=i*2+1;
				}
								
				
			}
			}
		}
	
	public void me3() {
		int[][] arr = { { 4, 1, 0 }, { 4, 1, 8 }, { 5, 7, 1 } };
		String[][] arr2 = { { "good", "oh", "my" }, { "god", "thank", "you" } };

		int[][][] arr3 = { { { 5, 6, 7, 8 } }, { { 9, 0, 1, 2 } }, { { 3, 4, 5, 6 } } };
		int[][] arr4 = { { 5, 6, 7 }, { 8, 9, 0 }, { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		arr4[2][1] = 100;
		System.out.println(arr4[2][1]);
		for (int j = 0; j < arr4[2].length; j++) {
			System.out.println(arr4[2][j]);
		}

		System.out.println(arr3[arr3.length - 1][0]);
		System.out.println("#########################");
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				for (int j2 = 0; j2 < arr3[j].length; j2++) {
					System.out.println(arr3[i][0][j2]);
				}
			}
		}

	}

	public void me22() {
		int[][] arr = new int[5][4];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		System.out.println(arr[0][2]);
		arr[arr.length - 1][0] = 100;
		System.out.println(arr[arr.length - 1][0]);
	}

	public void me21() {
		Dog[][] arr = new Dog[10][2];
		for (int i = 0; i < arr.length; i++) {
			Dog[] dogs = arr[i];
			System.out.println(dogs);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}

		}

	}

	public void me2() {
		StringBuffer[][] arr = new StringBuffer[5][3];
		System.out.println(arr.length);

		System.out.println(arr[0]);
	}

	public void me1() {

	}

}

package kr.co.test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		boolean isTrue = true;
		while (isTrue) {
			System.out.println("a 값을 입력하세요.");
			a = sc.nextInt();
			sc.nextLine();
			System.out.println("msg1값을 이력하세요");
			String msg1 = sc.nextLine();
			System.out.println(msg1);
			if (a==4) {
				break;
			}
			System.out.println(a+"를 넘겨받았습니다.");
			
		}
		System.out.println("End");
		sc.close();
	}

}

package kr.co.ezen;

import com.naver.Test;

public class MainEx {
//static 변수,상수,메서드 = class 변수,상수,메서드
//프로그램이 실행되면, 곧 바로 static 영역에 로딩이 되어 실행 가능한
//상태가 됌
//인스턴스 변수 : 객체 생성 시마다 만들어지기 때문에 인스턴스 변수
//static 변수/상수 : 객체 생성 개수와 상관 없이 무조건 1개만 생성됨.
//public static type 변수명;
//class명.변수명
//
//	
//	
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		t1.a =100;
		System.out.println(t1.a);
		
		Test.b = 500;
		System.out.println(Test.b);
		
		Test t2 = new Test();
		t2.a = 200;
		System.out.println(t2.a);
		System.out.println(Test.b);
		System.out.println(Test.b);
		Test.me1();
		
		
		
		
	
		
		
		
		
		
		
		
		

	}

}

package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;

public class MainEx {

	public MainEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Test t = new Test();
		//t.me4();
		t.me41(0, 4);
		t.me41(1, 4);
		t.me41(2, 4);
		t.me41(1,2);
		t.me41(4,4);
		t.me5();
		t.me51(5, 2);
		t.me51(1, 4);
		t.me51(1, 3);
		t.me51(2, 3);
		t.me51(3, 3);
		t.me52(1, 4);
		Test2 t2 = new Test2();
		t2.s1();
		t2.s12();
		//같은 숫자가 n번 반복되면 /연산자
		//특정 범위의 숫자가 계속 반복될때 %연산자  반복되는 숫자 중에서 가장 큰수+1
		t2.switchAI();
		t2.switchAI();
		t2.switchAI();
		t2.switchAI();
		t2.switchAI();
		t2.switchAI();
		t2.switchAI();
		t2.switchAI();
		t2.switchAI();

	}

}

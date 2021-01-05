package kr.co.ezen;

import com.naver.Ab;
import com.naver.Dog;
import com.naver.Test;

public class MainEx {
	//n차원 배열 안에서는 n-1 차원의 배열이 들어 있다

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		
		t1.me11();
		t1.me12(new Dog[5]);
		Dog[] arrDog = new Dog[3];
		t1.me12(arrDog);
		
		
		t1.me2();
		t1.me21();
		String[] arrStr = {"hello","world","good"};
		t1.me22(arrStr);
		t1.me31();
		Dog[] dogs = new Dog[]{new Dog(), new Dog(),new Dog()};
		t1.me32(dogs);
		t1.me33();
		t1.me3();
		System.out.println("#####");
		t1.me01();
		t1.me1();
		t1.me13();
		t1.me1();
		t1.name();
		t1.gugudan();
		t1.name2();
		Ab ab =new Ab();
		ab.name();
		ab.me3();
		
			
		
		
	}

}

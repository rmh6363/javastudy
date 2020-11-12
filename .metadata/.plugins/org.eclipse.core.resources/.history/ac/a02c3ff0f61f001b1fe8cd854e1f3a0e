package kr.co.ezen;

import com.naver.Bmw;
import com.naver.Car;
import com.naver.K7;
import com.naver.Sm5;
import com.naver.Sonata;

public class MainEx {

	public static void main(String[] args) {
		Sonata sonata1 = new Sonata();
		Bmw bmw1 = new Bmw();
		// 다형성 : 객체를 생성하는 다양한 방법
		// 부모자료형 변수명 = new 자식생성자();
		Car sonata2 = new Sonata();
		Car bmw2 = new Bmw();
		Car[] arrCar = {sonata1,bmw1,sonata2,bmw2};
		sonata1.equals(sonata2);//equals()메서드의 파라미터 자료형이 Object
		Car sm5 = new Sm5();
		sonata1.run();
		sonata2.run();
		sonata1.only();
		Sonata s=null;
		if(sonata2 instanceof Car) {
			s = (Sonata)sonata2;
			s.only();
		}
		if(sonata2 instanceof Sonata) {
			s = (Sonata)sonata2;
			s.only();
		}
		Sonata ss =null;
		if(sonata2.getClass()==Sonata.class) {
			ss = (Sonata)sonata2;
			ss.only();
		}
		
		
		
		
		
		

	}

}

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
		// ������ : ��ü�� �����ϴ� �پ��� ���
		// �θ��ڷ��� ������ = new �ڽĻ�����();
		Car sonata2 = new Sonata();
		Car bmw2 = new Bmw();
		Car[] arrCar = {sonata1,bmw1,sonata2,bmw2};
		sonata1.equals(sonata2);//equals()�޼����� �Ķ���� �ڷ����� Object
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

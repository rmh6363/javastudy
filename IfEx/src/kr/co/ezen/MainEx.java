package kr.co.ezen;

import com.naver.ElseIfEx;
import com.naver.IfElseEx02;
import com.naver.Person;
import com.naver.TV;
import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.me1();
		t1.me2(60);
		t1.me6(6);
		char c = t1.me7(66);
		System.out.println(c);
		TV tv1 = new TV(10, 15, false);
		tv1.powerOn();
		System.out.println(tv1.getVol());
		tv1.volUp();
		System.out.println(tv1.getVol());
		tv1.powerOff();
		tv1.volUp();
		System.out.println(tv1.getVol());
		IfElseEx02 ie = new IfElseEx02();
		ie.name();
		ElseIfEx el = new ElseIfEx();
		String gc = el.GradeCheck(62);
		System.out.println(gc);
		Person kim  =new Person(tv1);
		kim.tvOn();
		kim.tvOff();
		kim.tvOn();
		TV tv = kim.getTv1();
		
		System.out.println(tv.getCh());
		kim.getTv1().setVol(50);
		System.out.println(tv.getVol());
		
	}

}

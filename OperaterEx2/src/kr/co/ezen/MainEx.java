package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test4;
import com.naver.Test5;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		boolean result = t1.me1(2, 3);
		System.out.println(result);
		boolean ressult1 = t1.me2(30000000000L, 400000000000L);
		System.out.println(ressult1);
		String result2 = t1.me3(4, 5);
		System.out.println(result2);
		boolean result3 = t1.me4((byte)3,(byte)-5); //byte 형변환 필요
		System.out.println(result3);
		t1.me5((short)1,(short)2);
		t1.me51(true, true);
		t1.me6(false, true);
		System.out.println("###########################");
		Test2 t2 = new Test2();
		t2.k1(true, true);
		t2.k1(true, false);
		t2.k1(false, true);
		t2.k1(false, false);
		System.out.println("############################");
		t2.k2(false, false);
		t2.k2(false, true);
		t2.k2(true, false);
		t2.k2(true, true);
		System.out.println("###############################");
		t2.k3(true);
		boolean e = false;
		t2.k3(e);
		t2.switchBoolean();
		t2.switchBoolean();
		t2.switchBoolean();
		t2.switchBoolean();
		t2.switchBoolean();
		System.out.println("###########################");
		Test3 t3 = new Test3();
		t3.plus1();
		t3.plus11();
		t3.plus2();
		t3.plus21();
		System.out.println(t3.getB());
		t3.minus1();
		Test4 t4 = new Test4();
		t4.con1();
		System.out.println("############################");
		Test5 t5 = new Test5();
		t5.h1();
		t5.h2();
		t5.h3();
		t5.h4();
		t5.h5(4);
		t5.h6(3);
	
	}
}

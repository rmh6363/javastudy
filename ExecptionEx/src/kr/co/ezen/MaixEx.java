package kr.co.ezen;

import com.naver.InnerClass;
import com.naver.Test;
import com.naver.Test2;

public class MaixEx {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.me1();
		t1.me2();
		t1.me3();
		t1.me4(100);
		try {
			t1.me5(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("100�� �Է��ߴ��� ������ �߻�����.");
		}
		try {
			t1.me5(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("0�� �Է��ߴ��� ������ ������");
		}
		t1.me6(0);
		t1.me61();
		t1.me7("hi");
		//t1.me7("������");
		//t1.me71("������");	
		//t1.me72("������");
		
		try {
			t1.me10("������");
		} catch (Exception e) {
			System.out.println("�弳����");
		}
		System.out.println(123123123);
		Test2 t2 = new Test2();
		t2.ano.me1();
	}

}
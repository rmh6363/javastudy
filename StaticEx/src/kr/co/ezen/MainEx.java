package kr.co.ezen;

import com.naver.Test;

public class MainEx {
//static ����,���,�޼��� = class ����,���,�޼���
//���α׷��� ����Ǹ�, �� �ٷ� static ������ �ε��� �Ǿ� ���� ������
//���°� ��
//�ν��Ͻ� ���� : ��ü ���� �ø��� ��������� ������ �ν��Ͻ� ����
//static ����/��� : ��ü ���� ������ ��� ���� ������ 1���� ������.
//public static type ������;
//class��.������
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

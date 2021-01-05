package kr.co.ezen;

import com.naver.Test;
import com.naver.ZZZ;

public class MainEx {
//	�������� ����
//	main () : main 
//	run () : ����� �����念��

	public static void main(String[] args) {
		Thread ct= Thread.currentThread();
		String name = ct.getName();
		System.out.println(name);
		System.out.println("main start");
		Test t1 = new Test("����");
		Test t2 = new Test("�κ�");
		ZZZ t3 = new ZZZ(t1, "�̴Ͼ�");
		
        //t1�����尡
        //main�����庸��
        //���� dead���°� �ǰ�
        //�Ϸ���?
        //t1.join();
        //main()�޼��忡 �ڵ�
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//join( ) : �� �޼��带 ȣ����
//		������� ������ ������
//		�����ϴ� �����庸��
//		�۾��� �켱�Ѵ�.
//		���� dead���·� ������.
		
		System.out.println("main out");
		
		
		

	}

}
package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test4;
import com.naver.Test5;

public class MainEx {

	public static void main(String[] args) {
//		Thread ct =Thread.currentThread();
//		String name=ct.getName();
//		System.out.println(name);
		// 1. TestŬ������ ThreadŬ������ �������.
		// 2. TestŬ������ �̿��ؼ� Thread ��ü�� �������.
		// 3. TestŬ������ �̿��ؼ� Thread�� �������.
		System.out.println("main start");

		Test t1 = new Test();
		Test2 t2 = new Test2();
		Test3 r3 = new Test3();
		Test4 r4 = new Test4();
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r4);
		Test5 r5 = new Test5();
		Thread t5 = new Thread(r5);
		t5.start();
		t3.start();
		t4.start();
		t1.start();
		t2.start();
		System.out.println("main end");
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("��� ���� ������ ��, ���� ���� ������");				
			}
		}).start();
		

	}

}
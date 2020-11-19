package kr.co.ezen;

import com.naver.Sum;
import com.naver.Test;

public class MainEx {
	public static void main(String[] args) {
		System.out.println("main start");
		Sum sum = new Sum();
		
		//Test t1 = new Test(sum, 1, 10000);
		Test t1 = new Test(sum, 1, 5000);
		Test t2 = new Test(sum, 5001, 10000);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sum.getNum());
		System.out.println(sum.getTes());
	}

}

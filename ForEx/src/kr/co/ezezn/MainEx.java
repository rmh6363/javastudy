package kr.co.ezezn;

import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		t1.me7();
		t1.name();
		System.out.println("####################");
		
		for(int i = 0;i<100; i++) {
			
			if(i==3) {
				continue;
			}
			System.out.println(i);
			
		}
		t1.me4();
		
		

}
	}
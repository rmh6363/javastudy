package com.naver;

public class Test4 {
	int a = 10;
	public void me1() {
		class LocalInnerClass{
			public void lic() {
				System.out.println(a);
			}
		}
		LocalInnerClass lic = new LocalInnerClass();
		lic.lic();
		
		
	}

}

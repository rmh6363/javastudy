package com.naver;

import java.util.StringTokenizer;

public class Sm5 extends Car {

	public Sm5() {
		me2();
		
	}

	public Sm5(String model, String name, int price) {
		super(model, name, price);
		// TODO Auto-generated constructor stub
	}

	public void me2() {
		String str = "123#456#789";
		StringTokenizer st = new StringTokenizer(str,"#");
		String[] stc = new String[st.countTokens()];
		int i = 0;
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			stc[i] = token;
			i++;
			System.out.println(token);
		}
		
	}

	@Override
	public void run() {
		System.out.println("Sm5�� run();");
	}
	

}

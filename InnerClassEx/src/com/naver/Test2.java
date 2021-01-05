package com.naver;

public class Test2 {
	private String msg;
	
	public class MemberClass{//멤버 내부 클래스
		private int age;
		
		
		public void mc1() {
			System.out.println("mc1");
			me1();
			System.out.println(msg);
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		 
	 }
	public void me1() {
		
	}

}

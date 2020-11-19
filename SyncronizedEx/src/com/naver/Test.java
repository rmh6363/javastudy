package com.naver;

public class Test extends Thread{
	private Sum sum;
	private int start;
	private int end;
	public Test() {
		// TODO Auto-generated constructor stub
	}
	public Test(Sum sum, int start, int end) {
		super();
		this.sum = sum;
		this.start = start;
		this.end = end;
	}
	@Override
	public void run() {
		for (int i = start; i < end+1; i++) {
			sum.addNum(i);
			
		}
		for (int i = start; i < end+1; i++) {
			sum.subTes(i);
		}
	}

}

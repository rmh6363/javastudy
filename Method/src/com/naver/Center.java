package com.naver;

public class Center {
	private Call call;
	private Tel tel;
	public Center() {
		// TODO Auto-generated constructor stub
	}

	public Call getCall() {
		return call;
	}

	public void setCall(Call call) {
		this.call = call;
	}

	public Center(Call call) {
		super();
		this.call = call;
	}
	

	public Center(Tel tel) {
		super();
		this.tel = tel;
	}

	public Tel getTel() {
		return tel;
	}

	public void setTel(Tel tel) {
		this.tel = tel;
	}
	public void CallToCenter(Tel phone) {
		call.calling(phone);
	}
	
	

}

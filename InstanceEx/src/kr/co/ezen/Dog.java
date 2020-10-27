package kr.co.ezen;

import java.util.Date;

public class Dog {
	private int did;
	private String name;
	private java.util.Date birth;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.util.Date getBirth() {
		return birth;
	}

	public void setBirth(java.util.Date birth) {
		this.birth = birth;
	}

	public Dog(int did, String name, Date birth) {
		super();
		this.did = did;
		this.name = name;
		this.birth = birth;
	}

	public String sleep(String where) {
		String msg = where + "ø°º≠ ¿‹¥Ÿ";
		return msg;
	}

}

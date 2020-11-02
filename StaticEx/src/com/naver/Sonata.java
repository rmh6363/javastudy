package com.naver;

public class Sonata {
	public static String company;
	private String modelname;
	
	static {
		company = "hyundai";
	}
	
	public Sonata() {
		// TODO Auto-generated constructor stub
	}
	public static String getCompany() {
		return company;
	}
	public static void setCompany(String company) {
		Sonata.company = company;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public Sonata(String modelname) {
		super();
		this.modelname = modelname;
	}
	

}

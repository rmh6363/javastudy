package kr.co.controller;

public class CommandAction {
	private String where;
	private boolean isredirect;
	
	public CommandAction() {
		// TODO Auto-generated constructor stub
	}

	public CommandAction(String where, boolean isredirect) {
		super();
		this.where = where;
		this.isredirect = isredirect;
	}

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	public boolean isIsredirect() {
		return isredirect;
	}

	public void setIsredirect(boolean isredirect) {
		this.isredirect = isredirect;
	}
	

}

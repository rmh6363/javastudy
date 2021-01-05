package kr.co.ezen;

public class Stone {
	private String name;
	private String locate;
	private String size;
	
	public Stone() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocate() {
		return locate;
	}
	public void setLocate(String locate) {
		this.locate = locate;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Stone(String name, String locate, String size) {
		super();
		this.name = name;
		this.locate = locate;
		this.size = size;
	}

}

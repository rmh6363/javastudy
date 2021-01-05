package kr.co.ezen;

import java.io.Serializable;

public class DTO2 implements Serializable, Comparable<DTO2>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String addr;
	private String name;
	private int price;
	public DTO2() {
		// TODO Auto-generated constructor stub
	}
	public DTO2(String id, String addr, String name, int price) {
		super();
		this.id = id;
		this.addr = addr;
		this.name = name;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return id + " : " + addr + " : "+ name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DTO2 other = (DTO2) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public int compareTo(DTO2 o) {
		// TODO Auto-generated method stub
		return this.getId().compareTo(o.getId());
	}
	

}

package com.daum;

public class Chapion {
	Position[] pt;
	Position p;
	public Chapion() {
		
	}
	public Position[] getPt() {
		return pt;
	}
	public void setPt(Position[] pt) {
		this.pt = pt;
	}
	public Position getP() {
		return p;
	}
	public void setP(Position p) {
		this.p = p;
	}
	public Chapion(Position[] pt, Position p) {
		super();
		this.pt = pt;
		this.p = p;
	}
	public void changePosition(int positionidx) {
		if(positionidx >= pt.length || positionidx < 0) {
			positionidx = pt.length-1;
		}
		p = pt[positionidx];
		System.out.println(p + "로 변경되었습니다.");

	}
	public void attack(Baron nasher) {
		p.attack(nasher);
	}

}

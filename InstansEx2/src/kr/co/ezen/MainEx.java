package kr.co.ezen;

import com.naver.Bow;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.Spear;
import com.naver.Sword;

public class MainEx {

	public static void main(String[] args) {
		Sword sword = new Sword();
		Monster mon = new Monster();
		Bow bow = new Bow();
		Hero hero = new Hero(bow);
		Spear spear = new Spear();
		hero.attack(sword, mon);
		hero.attack(mon);
		hero.setSpear(spear);
		hero.attackBySpear(mon);

		
		
		


	}

}

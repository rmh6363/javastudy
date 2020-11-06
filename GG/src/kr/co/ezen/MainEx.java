package kr.co.ezen;

import com.daum.AD;
import com.daum.Baron;
import com.daum.Chapion;
import com.daum.JG;
import com.daum.MID;
import com.daum.Position;
import com.naver.Bow;
import com.naver.Gun;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.Sword;
import com.naver.Weapon;

public class MainEx {

	public static void main(String[] args) {
		Monster mon = new Monster(100);
		Weapon[] weapons = {new Bow(1, "È°"),new Sword(5, "°Ë"),new Gun(10, "ÃÑ")};
		Weapon w = weapons[2];
		
		Hero spyderman = new Hero(weapons,w);
		spyderman.attack(mon);
		spyderman.attack(mon);
		spyderman.changeWeapon(0);
		spyderman.changeWeapon(1);
		spyderman.attack(mon);
		
		Baron nasher = new Baron(100);
		Position[] pt = {new AD("ad", 10),new MID("mid", 5),new JG("jg", 3)};
		Position p = pt[0];
		Chapion champ = new Chapion(pt, p);
		champ.attack(nasher);
		champ.attack(nasher);
		champ.attack(nasher);
		champ.changePosition(1);
		champ.attack(nasher);

		
	}}

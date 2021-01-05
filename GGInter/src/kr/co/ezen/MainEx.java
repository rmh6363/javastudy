package kr.co.ezen;

import java.util.Scanner;

import com.naver.Bow;
import com.naver.Gun;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.SetUp;
import com.naver.Sword;
import com.naver.Weapon;

public class MainEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Monster mon = new Monster(SetUp.MONSTER_HP);

		Weapon[] weapons = { new Bow("활",SetUp.BOW_POWER), new Sword("검", SetUp.SWORD_POWER) , new Gun("총", SetUp.GUN_POWER)};
		Weapon w = weapons[2];
		Hero hero = new Hero(weapons, w);
		int weaponidx = 0;
		int menu = 0;
		boolean isTrue = true;
		while (isTrue) {
			System.out.println("다음중 하나를 선택하시오.");
			System.out.println("0 : 공격, 1 : 무기교체, 2 : 종료.");
			menu = sc.nextInt();
			if (menu == 2) {
				break;
			}
			if (menu == 0) {
				hero.attack(mon);

			} else if (menu == 1) {
				System.out.println("무기를 선택하세요");
				for (int i = 0; i < weapons.length; i++) {
					System.out.print(i);
					System.out.print(":" + weapons[i] + "");
				}
				System.out.println();
				weaponidx = sc.nextInt();
				sc.nextLine();
				hero.changeWeapon(weaponidx);

			}

		}
		sc.close();
	}
}

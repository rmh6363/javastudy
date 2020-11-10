package kr.co.ezen;

import java.util.Scanner;

import com.naver.Bow;
import com.naver.Gun;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.Sword;
import com.naver.Weapon;

public class MainEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Monster mon = new Monster(100);
		Weapon[] weapons = {new Bow("활", 5), new Sword("칼", 7), new Gun("총", 10)};
		Weapon w =weapons[2];
		Hero hero = new Hero(weapons, w);
		int menu = 0;
		int weaponidx = 0;
		boolean isTrue = true;
		
		while(isTrue) {
			System.out.println("다음 중 하나를 고르시오");
			System.out.println("0 : 공격, 1: 무기교체, 2 : 종료");
			menu = sc.nextInt();
			if(menu==0) {
				hero.attack(mon);
				
			}
			if(menu ==2) {
				break;
				
			}
			if(menu == 1) {
				System.out.println("무기를 선택시오");
				for (int i = 0; i < weapons.length; i++) {
					System.out.print(i);
					System.out.print(" : "+weapons[i]+" ");
				}
				System.out.println();
				weaponidx = sc.nextInt();
				sc.nextLine();
				hero.changeWeapon(weaponidx);
				
			}
		}sc.close();
		
		

	}

}

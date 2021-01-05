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
		Weapon[] weapons = {new Bow(5, "bow"), new Sword(3, "sword"),new Gun(10, "gun")};
		Weapon w = weapons[2];
		Hero hero = new Hero(weapons, w);
		int weaponidx = 0;
		int menu = 0;
		boolean isTrue = true;
		while (isTrue) {
			System.out.println("������ �ϳ��� �����Ͻÿ�.");
			System.out.println("0 : ����, 1 : ���ⱳü, 2 : ����.");
			menu = sc.nextInt();
			if(menu == 2) {
				break;
			}
			if(menu ==0) {
				hero.attack(mon);
				
			}else if(menu == 1) {
				System.out.println("���⸦ �����ϼ���");
				for (int i = 0; i < weapons.length; i++) {
					System.out.print(i);
					System.out.print(":"+weapons[i]+"");
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
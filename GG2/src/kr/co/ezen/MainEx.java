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
		Weapon[] weapons = {new Bow("Ȱ", 5), new Sword("Į", 7), new Gun("��", 10)};
		Weapon w =weapons[2];
		Hero hero = new Hero(weapons, w);
		int menu = 0;
		int weaponidx = 0;
		boolean isTrue = true;
		
		while(isTrue) {
			System.out.println("���� �� �ϳ��� ���ÿ�");
			System.out.println("0 : ����, 1: ���ⱳü, 2 : ����");
			menu = sc.nextInt();
			if(menu==0) {
				hero.attack(mon);
				
			}
			if(menu ==2) {
				break;
				
			}
			if(menu == 1) {
				System.out.println("���⸦ ���ýÿ�");
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

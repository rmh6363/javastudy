package kr.co.ezen;

import java.util.Scanner;

import com.naver.Command;
import com.naver.EndCommand;
import com.naver.InsertCommand;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Command[] menu = {new InsertCommand(),new EndCommand()};
		while (true) {
			System.out.println("메뉴를 선택해 주세요");
			
			for (int i = 0; i < menu.length; i++) {
				System.out.print(i+" : "+ menu[i]);
				if (i<menu.length-1) {
					System.out.print(", ");
				}
			}
			System.out.println();
			try {
				int idx = sc.nextInt();
				sc.nextLine();
				menu[idx].execute(sc);
			} catch (Exception e) {
				System.out.println("메뉴를 올바르게 선택해 주세요.");
			}
			
		}
		
		

	
		
		

	

	}}

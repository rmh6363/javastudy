package kr.co.ezen;

import java.util.Scanner;

import com.naver.Command;
import com.naver.DeleteCommand;
import com.naver.EndCommand;
import com.naver.InsertCommand;
import com.naver.selectCommand;
import com.naver.updateCommand;

public class MainEx {

	public static void main(String[] args) {
		Command[] menus = {new InsertCommand(),new selectCommand(),new DeleteCommand(),new updateCommand(),new EndCommand()
				};
		
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("메뉴를 선택하세요.");
			for (int i = 0; i < menus.length; i++) {
				System.out.print(i +" : "+menus[i]);
				if(i < menus.length-1) {
					System.out.print(", ");
				}
			}
			System.out.println();
			int idx = sc.nextInt();	
			sc.nextLine();
			menus[idx].execute(sc);
		}
		
		
		
		
		
		
	}

}

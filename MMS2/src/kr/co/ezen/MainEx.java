package kr.co.ezen;

import java.util.Scanner;

import com.naver.Command;

import com.naver.InsertCommand;
import com.naver.SelectCommand;


public class MainEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Command[] cms = {new InsertCommand(),new SelectCommand()};
		boolean isOk = true;
		int idx = 0;
		
		while(isOk) {
			System.out.println("������ �޴��� ������");
			System.out.println("0 : ȸ���Է�, 1 : ȸ����ȸ, 2 : ����");
			idx = sc.nextInt();
			sc.nextLine();
			if(idx==2) {
				break;
			}
			cms[idx].execute(sc);
			
		}sc.close();
	
	}
}

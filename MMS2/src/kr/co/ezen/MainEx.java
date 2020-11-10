package kr.co.ezen;

import java.util.Scanner;

import com.naver.Command;
import com.naver.DeletCommand;
import com.naver.InsertCommand;
import com.naver.SelectCommand;
import com.naver.UpdateCommand;

public class MainEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Command[] cms = {new InsertCommand(), new SelectCommand(), new DeletCommand(), new UpdateCommand()};
		boolean isOk = true;
		int idx = 0;
		while(isOk) {
			System.out.println("메뉴를 선택하시요");
			System.out.println("0 : 회원입력, 1 : 회원조회, 2 : 회원삭제, 3 : 회원수정, 4 : 종료");
			idx = sc.nextInt();
			sc.nextLine();
			if(idx == cms.length) {
				break;
			}
			cms[idx].execute(sc);
			}sc.close();

	}
}

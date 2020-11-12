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
		Command[] coms = { new InsertCommand(), new SelectCommand(), new DeletCommand(), new UpdateCommand() };
		boolean isOk = true;
		int idx = -1;
		try {
			while (isOk) {
				System.out.println("메뉴를 선택하시오.");
				System.out.println("0 : 회원 입력, 1 : 회원 조회, 2 : 삭제, 3 : 회원 수정, 4 : 종료");
				idx = sc.nextInt();
				sc.nextLine();

				if (idx == coms.length) {
					break;
				}
				coms[idx].execute(sc);

			}
		} catch (Exception e) {
			idx = coms.length-1;
		}
		sc.close();

	}

}

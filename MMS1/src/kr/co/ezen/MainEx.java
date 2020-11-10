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
		while (isOk) {
			System.out.println("�޴��� �����Ͻÿ�.");
			System.out.println("0 : ȸ�� �Է�, 1 : ȸ�� ��ȸ, 2 : ����, 3 : ȸ�� ����, 4 : ����");
			idx = sc.nextInt();
			sc.nextLine();

			if (idx == coms.length) {
				break;
			}
			coms[idx].execute(sc);

		}
		sc.close();

	}

}

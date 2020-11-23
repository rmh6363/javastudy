package kr.co.ezen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.naver.Command;
import com.naver.DeletCommand;
import com.naver.EndCommand;
import com.naver.InsertCommand;
import com.naver.MemberDTO;
import com.naver.SelectCommand;
import com.naver.UpdateCommand;

public class MainEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Command> list = new ArrayList<Command>();
		list.add(new InsertCommand());
		list.add(new SelectCommand());
		list.add(new DeletCommand());
		list.add(new UpdateCommand());
		list.add(new EndCommand());
		boolean isOk = true;
		int idx = -1;
		try {
			while (isOk) {
				System.out.println("메뉴를 선택하세요.");
				for (int i = 0; i < list.size(); i++) {
					Command cms = list.get(i);
					System.out.print(" "+i+" : ");
					System.out.print(cms);
					if (i == list.size()-1) {
						break;
					}
					System.out.print(" ,");
				}
				System.out.println();
				idx = sc.nextInt();
				sc.nextLine();
				if (idx == list.size()) {
					break;
					
				}
				list.get(idx).execute(sc);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sc.close();
		}
		
		
		
		

	}

}

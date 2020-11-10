package com.naver;

import java.util.Scanner;

public class UpdateCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("수정할 id를 입력해주세요");
		String id  = sc.nextLine();
		System.out.println("새로운 name을 입력하세요.");
		String name = sc.nextLine();
		System.out.println("새로운 age를 입력하세요.");
		int age = sc.nextInt();
		sc.nextLine();
		MemberDTO mdto = new MemberDTO(id, name, age);
		int idx =DB.db.indexOf(mdto);
		
		DB.db.set(idx, mdto);
		
		
	
		
		
	}

}

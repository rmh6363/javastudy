package com.naver;

import java.util.Scanner;

public class UpdateCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("������ id�� �Է����ּ���");
		String id  = sc.nextLine();
		System.out.println("���ο� name�� �Է��ϼ���.");
		String name = sc.nextLine();
		System.out.println("���ο� age�� �Է��ϼ���.");
		int age = sc.nextInt();
		sc.nextLine();
		MemberDTO mdto = new MemberDTO(id, name, age);
		int idx =DB.db.indexOf(mdto);
		
		DB.db.set(idx, mdto);
		
		
	
		
		
	}

}

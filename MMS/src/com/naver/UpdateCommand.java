package com.naver;

import java.util.Scanner;

public class UpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("�����Ͻ� ID�� �Է����ּ���");
		String id = sc.nextLine();
		System.out.println("���ο� name�� �Է����ּ���");
		String name = sc.nextLine();
		System.out.println("���ο� age�� �Է����ּ���");
		int age =sc.nextInt();
		sc.nextLine();
		MemberDTO dto = new MemberDTO(id, name, age);
		int idx = DB.db.indexOf(dto);
		DB.db.set(idx, dto);
		
	}

	@Override
	public String toString() {
		return "����";
	}

}
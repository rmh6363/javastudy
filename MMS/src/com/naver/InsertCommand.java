package com.naver;

import java.util.Scanner;

public class InsertCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("ID�� �Է����ּ���.");
		String id = sc.nextLine();
		System.out.println("NAME�� �Է����ּ���.");
		String name = sc.nextLine();
		System.out.println("age�� �Է����ּ���.");
		int age = sc.nextInt();
		sc.nextLine();
		MemberDTO dto = new MemberDTO(id, name, age);
		DB.db.add(dto);
		
		
	}

	@Override
	public String toString() {
		return "���";
	}


}

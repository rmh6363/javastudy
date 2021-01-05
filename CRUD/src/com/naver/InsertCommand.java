package com.naver;

import java.util.Scanner;

public class InsertCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("ȸ�������� ȯ���մϴ�.");
		System.out.println("���̵� �Է��� �ּ���.");
		String id = sc.nextLine();
		System.out.println("�̸��� �Է��� �ּ���.");
		String name = sc.nextLine();
		System.out.println("������ �Է��� �ּ���.");
		String job = sc.nextLine();
		System.out.println("��������� �Է����ּ���.");
		String birth = sc.nextLine();
		MemberDTO dto = new MemberDTO(id, name, job, birth);
		MemberDAO dao = new MemberDAO();
		dao.insert(dto);
		
		
		
	}

	@Override
	public String toString() {
		return "ȸ������";
	}

}
package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {

		System.out.println("������ ���̵� �Է����ּ���");
		String mid = sc.nextLine();
		MemberDTO dto = new MemberDTO(mid, null, null, null);
		MemberDAO dao = new MemberDAO();
		dao.delete(dto);

	}

	@Override
	public String toString() {
		return "����";
	}

}
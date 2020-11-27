package com.naver;

import java.util.Scanner;

public class InsertCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("회원가입을 환영합니다.");
		System.out.println("아이디를 입력해 주세요.");
		String id = sc.nextLine();
		System.out.println("이름을 입력해 주세요.");
		String name = sc.nextLine();
		System.out.println("직업을 입력해 주세요.");
		String job = sc.nextLine();
		System.out.println("생년월일을 입력해주세요.");
		String birth = sc.nextLine();
		MemberDTO dto = new MemberDTO(id, name, job, birth);
		MemberDAO dao = new MemberDAO();
		dao.insert(dto);
		
		
		
	}

	@Override
	public String toString() {
		return "회원가입";
	}

}

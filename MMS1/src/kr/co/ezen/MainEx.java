package kr.co.ezen;

import com.naver.DB;
import com.naver.MemberDTO;

public class MainEx {

	public static void main(String[] args) {
		DB db = new DB();
		MemberDTO dto = new MemberDTO("mms001", "rmh", 26);
		db.insert(dto);
		
		
	
}}

package kr.co.ezen;

import java.sql.Date;
import java.util.Calendar;

import com.naver.MemberDAO;
import com.naver.MemberDTO;


public class MainEx {

	public static void main(String[] args) {
		
		MemberDAO dao2 = new MemberDAO();
		MemberDTO dto = new MemberDTO("m008", "jin", "a", new Date(Calendar.getInstance().getTimeInMillis()));
//		dao2.insert(dto);
//		dao2.delete(new MemberDTO("m001", null, null, null));
		dao2.update(new MemberDTO("m002", "roh", "z", new Date(Calendar.getInstance().getTimeInMillis())));

	}

}

package kr.co.ezen;

import com.naver.AccountDAO;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDAO dao = new AccountDAO();
		dao.transter("kim", "lee", 10000);

	}

}

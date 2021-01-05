package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	private final String DRIVER = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String NAME = "ezen";
	private final String PW = "ezen";

	public MemberDAO() {
		try {
			Class.forName(DRIVER);

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버로딩 실패");
			e.printStackTrace();
		}
	}

	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void insert(MemberDTO dto) {

		Connection conn = null;

		PreparedStatement pstmt = null;
		String sql = "insert into crud values(?,?,?,?)";
		boolean isOk = false;

		try {
			conn = DriverManager.getConnection(URL, NAME, PW);

			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getId());
							
			pstmt.setString(2, dto.getName());

			pstmt.setString(3, dto.getJob());

			pstmt.setString(4, dto.getBirth());
			if (dto.getBirth().length() != 10) {

				throw new Exception();
			}
			pstmt.executeUpdate();
			isOk = true;

		} catch (Exception e) {
			if (dto.getId().length() > 10) {
				System.out.println("아이디는 10글자 이내로 입력해주세요.");
			} else if (dto.getBirth().length() != 10) {
				System.out.println("생년월일을 yyyy-mm-dd으로 입력해주세요");
			} 

			

		} finally {
			try {
				if (isOk) {
					conn.commit();
				} else {
					conn.rollback();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			closeAll(null, pstmt, conn);
		}

	}
	

}

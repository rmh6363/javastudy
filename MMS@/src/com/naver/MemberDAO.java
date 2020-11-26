package com.naver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String NAME = "ezen";
	private final String PW = "ezen";

	public MemberDAO() {
		try {
			Class.forName(DRIVER_NAME);
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}

	private void closeAll(ResultSet rs, PreparedStatement pstmt, Connection conn) {
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

	public void delete(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "delete from member where mid = ?";
		try {
			conn = DriverManager.getConnection(URL, NAME, PW);
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getMid());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(null, pstmt, conn);
		}
	}

	public void update(MemberDTO dto) {
		// transaction 필요없지만 연습하기 위해 삽입
		Connection conn = null;
		PreparedStatement pstmt = null;
		boolean isOk = false;
		String sql = "update member set name = ?where mid = ?";
		try {
			conn = DriverManager.getConnection(URL, NAME, PW);
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getMid());
			pstmt.executeUpdate();
			isOk = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (isOk) {
					conn.commit();
				} else {
					conn.rollback();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		closeAll(null, pstmt, conn);
	}

	public List<MemberDTO> select() {
		// transaction 필요없지만 연습하기 위해 삽입
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select mid,name 이름,job 직업, birth from member";
		ResultSet rs = null;
		boolean isOk = false;
		try {
			conn = DriverManager.getConnection(URL, NAME, PW);
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String mid = rs.getString("mid");
				String name = rs.getString("이름");
				String job = rs.getString("직업");
				Date birth = rs.getDate("birth");
				MemberDTO dto = new MemberDTO(mid, name, job, birth);
				list.add(dto);

			}
			isOk = true;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (isOk) {
					conn.commit();
				} else {
					conn.rollback();
				}
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			closeAll(rs, pstmt, conn);
		}

		return list;
	}

	public void insert(MemberDTO dto) {
		// transaction 필요없지만 연습하기 위해 삽입
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into member(mid,name,job,birth) values(?,?,?,?)";
		boolean isOk = false;
		try {
			conn = DriverManager.getConnection(URL, NAME, PW);
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getMid());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getJob());
			pstmt.setDate(4, dto.getBirth());
			pstmt.executeUpdate();
			isOk = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (isOk) {
					conn.commit();

				} else {
					conn.rollback();
				}
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			closeAll(null, pstmt, conn);
		}
	}

}

package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class AccountDAO {
	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String NAME = "ezen";
	private final String PW = "ezen";
	boolean isOk = false;
	public AccountDAO() {
		try {
			Class.forName(DRIVER_NAME);
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}

	}
	
	public void transter(String fromId, String toId, int howMuch)  {
		Connection conn = null;
		
		PreparedStatement pstmt = null;
		String sql = "update account set balance = balance + ? where id = ?";
		String sql2 = "update account set balance = balance -? where id = ?";
		try {
			conn = DriverManager.getConnection(URL, NAME, PW);//오토커밋 해제
			conn.setAutoCommit(false);
		
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, howMuch);
			pstmt.setString(2, toId);
		
			
			pstmt.executeUpdate();
			if(pstmt!= null) {
				pstmt.close();
			}

			pstmt = conn.prepareStatement(sql2);
		
			pstmt.setInt(1, howMuch);
			pstmt.setString(2, fromId);
			pstmt.executeUpdate();
			
			isOk=true; //정상적으로 처리됌
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (isOk) {
					conn.commit();
				}else {
					conn.rollback();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				
				if (pstmt != null) {
					pstmt.close();
									}
				if (conn != null) {
					conn.close();
			
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	

}

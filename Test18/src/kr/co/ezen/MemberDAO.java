package kr.co.ezen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MemberDAO {
	private DataSource dataFactory;
	
	public MemberDAO() {
		
		try {
			Context ctx = new InitialContext();
			dataFactory= (DataSource) ctx.lookup("java:comp/env/jdbc/oracle11g");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public LoginDTO login(LoginDTO loginDTO) {
		LoginDTO resultDTO = null;
		
		Connection conn = null;
		PreparedStatement pstmt= null;
		String sql = "select * from member where id =? and age =?";
		ResultSet rs =null;
		try {
			conn =dataFactory.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loginDTO.getId());
			pstmt.setInt(2, loginDTO.getAge());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				resultDTO = new LoginDTO();
				resultDTO.setId(loginDTO.getId());
				resultDTO.setName(name);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return resultDTO;
	}

	
	

	
}

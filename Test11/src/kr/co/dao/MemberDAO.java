package kr.co.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import kr.co.domain.MemberDTO;

public class MemberDAO {
	private DataSource dataFactory;
	
	public MemberDAO() {
		try {
			Context ctx = new InitialContext();
			dataFactory = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle11g");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	public void CloseAll(Connection conn, PreparedStatement pstmt, ResultSet rs) {
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
	public void Insert(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		  String sql = "INSERT INTO member (id, name, age) VALUES (?, ?, ?)";

		try {
			 conn = dataFactory.getConnection();
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setString(1, dto.getId());
			 pstmt.setString(2, dto.getName());
			 pstmt.setInt(3, dto.getAge());
			 pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CloseAll(conn, pstmt, null);
		}
	}
	public List<MemberDTO> list() {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select * from member";
		ResultSet rs = null;
		try {
			conn = dataFactory.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				MemberDTO dto = new MemberDTO(id, name, age);
				list.add(dto);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CloseAll(conn, pstmt, rs);
		}
		
		return list; 
	}
	

}

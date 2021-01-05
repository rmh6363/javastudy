package kr.co.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import kr.co.command.LoginDTO;

import kr.co.domain.MemberDTO;
import oracle.net.aso.p;


public class MemberDAO {
	private DataSource dataFactory;
	public MemberDAO() {
		try {
			Context ctx = new InitialContext();
			dataFactory = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle11g");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void CloseAll(ResultSet rs, Connection conn, PreparedStatement pstmt) {
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
		String sql = "insert into tbl_member values(?,?,?)";
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
			CloseAll(null, conn, pstmt);
			
		}
	}
	public List<MemberDTO> list() {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection conn =null;
		PreparedStatement pstmt = null;
		String sql = "select * from tbl_member";
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
			CloseAll(rs, conn, pstmt);
		}
		
		
		
		return list;
				
	}
	public MemberDTO read(String id) {
		MemberDTO dto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from tbl_member where id = ?";
		try {
			conn = dataFactory.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				dto = new MemberDTO(id, name, age);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CloseAll(rs, conn, pstmt);
		}
				
	
		return dto;
	}
	public MemberDTO updateui(String id) {
		
		return read(id);
		
	}
	public void update(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update tbl_member set name =?, age =? where id =?";
		try {
			conn = dataFactory.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(3, dto.getId());
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getAge());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CloseAll(null, conn, pstmt);
		}
	}
	public void delete(String id) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "delete from tbl_member where id =?";
		try {
			conn = dataFactory.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CloseAll(null, conn, pstmt);
		}
		
	}
	
	public Map<String, String> menuMap() {
		Map<String, String> map = new HashMap<String, String>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select * from menu";
		ResultSet rs = null;
		try {
			conn = dataFactory.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String sp = rs.getString(1);
				String fullname = rs.getString(2);
				map.put(sp, fullname);
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CloseAll(rs, conn, pstmt);
		}
		
		return map;
		
	}
	public LoginDTO login(LoginDTO loginDTO) {
		LoginDTO login = new LoginDTO();
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select name from tbl_member where id = ? and age = ?";
		ResultSet rs = null;
		try {
			conn = dataFactory.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loginDTO.getId());
			pstmt.setInt(2, loginDTO.getAge());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString(1);
				login = new LoginDTO();
				login.setId(loginDTO.getId());
				login.setName(name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CloseAll(rs, conn, pstmt);
		}
		return login;
	}
	

}

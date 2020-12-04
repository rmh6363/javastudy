package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MemberDAO {

	
	public MemberDAO() {
		try {
			Class.forName(Command.DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("연결실패");
		}
	}

	public void NoBirthInsertCommand(MemberDTO dto) {
		Connection conn = null;

		PreparedStatement pstmt = null;
		String sql = "insert into member_p(member_num, member_id, member_pw, member_name, member_email)values(num.nextval,?,?,?,?)";
		boolean isOk = false;

		try {
			conn = DriverManager.getConnection(Command.URL, Command.USER, Command.PASSWORD);

			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getMember_id());

			pstmt.setString(2, dto.getMember_pw());

			pstmt.setString(3, dto.getMember_name());

			pstmt.setString(4, dto.getMember_email());

			pstmt.executeUpdate();
			isOk = true;

		} catch (Exception e) {
			{
				e.printStackTrace();
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

		}

	}
	public void insert(MemberDTO dto) {
		Connection conn = null;

		PreparedStatement pstmt = null;
		String sql = "insert into member_P values(num.nextval,?,?,?,?,?)";
		boolean isOk = false;

		try {
			conn = DriverManager.getConnection(Command.URL, Command.USER, Command.PASSWORD);

			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getMember_id());

			pstmt.setString(2, dto.getMember_pw());

			pstmt.setString(3, dto.getMember_name());

			pstmt.setString(4, dto.getMember_birth());

			pstmt.setString(5, dto.getMember_email());

			pstmt.executeUpdate();
			isOk = true;

		} catch (Exception e) {
			{
				e.printStackTrace();
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

		}

	}
		
	public void update(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt =null;
		String sql="update member_P set member_id=?, member_pw=?, member_name=?, member_birth=?, member_email=? where member_num=?";
		
		try {
			conn=DriverManager.getConnection(Command.URL,Command.USER, Command.PASSWORD);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getMember_id());
			pstmt.setString(2, dto.getMember_pw());
			pstmt.setString(3, dto.getMember_name());
			pstmt.setString(4, dto.getMember_birth());
			pstmt.setString(5, dto.getMember_email());
			pstmt.setInt(6, dto.getMember_num());
			pstmt.executeUpdate();
			
						
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(null, pstmt, conn);
		}
	}
	public void delete(MemberDTO dto) {
		Connection conn =null;
		PreparedStatement pstmt=null;
		String sql = "delete from member_P where member_num=?";
		try {
			conn = DriverManager.getConnection(Command.URL, Command.USER, Command.PASSWORD);
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getMember_num());
			pstmt.executeUpdate();
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(null, pstmt, conn);
		}
		
	}
	
	public List<MemberDTO> select() {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		String sql="select * from member_P";
		try {
			conn =DriverManager.getConnection(Command.URL, Command.USER, Command.PASSWORD);
			pstmt=conn.prepareStatement(sql);
			
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int member_num = rs.getInt("member_num");
				String member_id = rs.getString("member_id");
				String member_pw = rs.getString("member_pw");
				String member_name = rs.getString("member_name");
				String member_birth = rs.getString("member_birth");
				String member_email = rs.getString("member_email");
				
				MemberDTO dto = new MemberDTO(member_num, member_id, member_pw, member_name, member_birth, member_email);
				list.add(dto);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(rs, pstmt, conn);
		}
		
		return list;
	}
	
	public List<MemberDTO> selectBybirth(int age) {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Calendar cal = Calendar.getInstance();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		String sql = "select * from member_P where member_birth like ?";
		MemberDTO dto =null;
		try {
			conn=DriverManager.getConnection(Command.URL,Command.USER, Command.PASSWORD);
			pstmt = conn.prepareStatement(sql);
			int member_birth_year=cal.get(Calendar.YEAR)-age;
			String birth=String.valueOf(member_birth_year);
			pstmt.setString(1, "%"+birth+"%");
			
			rs=pstmt.executeQuery();
			while (rs.next()) {
				int member_num=rs.getInt("member_num");
				String member_id=rs.getString("member_id");
				String member_pw=rs.getString("member_pw");
				String member_name=rs.getString("member_name");
				String member_email=rs.getString("member_email");
				String member_birth=rs.getString("member_birth");
				
				dto = new MemberDTO(member_num, member_id, member_pw, member_name, member_birth, member_email);
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(rs, pstmt, conn);
		}
		
		return list;
	}
			
	public MemberDTO selectByNum(int member_num) {
			Connection conn = null;
			PreparedStatement pstmt =null;
			ResultSet rs=null;
			String sql="select * from member_P where member_num=?";
			MemberDTO dto =null;
			try {
				conn=DriverManager.getConnection(Command.URL,Command.USER, Command.PASSWORD);
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, member_num);
				
				rs=pstmt.executeQuery();
				if (rs.next()) {
					String member_id=rs.getString("member_id");
					String member_pw=rs.getString("member_pw");
					String member_name=rs.getString("member_name");
					String member_birth=rs.getString("member_birth");
					String member_email=rs.getString("member_email");
					
					dto = new MemberDTO(member_num, member_id, member_pw, member_name, member_birth, member_email);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				closeAll(rs, pstmt, conn);
			}
			
			return dto;
		}
		
	public List<MemberDTO> selectByName(String name) {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection conn = null;
		PreparedStatement pstmt =null;
		ResultSet rs=null;
		String sql="select * from member_P where member_name like ?";
		MemberDTO dto =null;
		try {
			conn=DriverManager.getConnection(Command.URL,Command.USER, Command.PASSWORD);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+name+"%");
			
			rs=pstmt.executeQuery();
			while (rs.next()) {
				int member_num=rs.getInt("member_num");
				String member_id=rs.getString("member_id");
				String member_pw=rs.getString("member_pw");
				String member_name=rs.getString("member_name");
				String member_birth=rs.getString("member_birth");
				String member_email=rs.getString("member_email");
				
				dto = new MemberDTO(member_num, member_id, member_pw, member_name, member_birth, member_email);
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(rs, pstmt, conn);
		}
		
		if(dto==null) {
			return null;
		}else {
			return list;
		}
		
	}

	
	public List<MemberDTO> selectByid(String id) {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection conn = null;
		PreparedStatement pstmt =null;
		ResultSet rs=null;
		String sql="select * from member_P where member_id like ?";
		MemberDTO dto =null;
		try {
			conn=DriverManager.getConnection(Command.URL,Command.USER, Command.PASSWORD);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+id+"%");
			
			rs=pstmt.executeQuery();
			while (rs.next()) {
				int member_num=rs.getInt("member_num");
				String member_id=rs.getString("member_id");
				String member_pw=rs.getString("member_pw");
				String member_name=rs.getString("member_name");
				String member_birth=rs.getString("member_birth");
				String member_email=rs.getString("member_email");
				
				dto = new MemberDTO(member_num, member_id, member_pw, member_name, member_birth, member_email);
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(rs, pstmt, conn);
		}
		
		return list;
	}
	public MemberDTO selectByEquelId(String member_id) {
		Connection conn = null;
		PreparedStatement pstmt =null;
		ResultSet rs=null;
		String sql="select * from member_P where member_id = ?";
		MemberDTO dto =null;
		try {
			conn=DriverManager.getConnection(Command.URL,Command.USER, Command.PASSWORD);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member_id);
			
			rs=pstmt.executeQuery();
			while (rs.next()) {
				int member_num=rs.getInt("member_num");
				String member_pw=rs.getString("member_pw");
				String member_name=rs.getString("member_name");
				String member_birth=rs.getString("member_birth");
				String member_email=rs.getString("member_email");
				
				dto = new MemberDTO(member_num, member_id, member_pw, member_name, member_birth, member_email);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(rs, pstmt, conn);
		}
		
		return dto;
	}
	
	private void closeAll(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		
		try {
			if (rs !=null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}

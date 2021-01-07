package kr.co.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import kr.co.domain.BoardDTO;
import kr.co.domain.PageTO;

public class BoardDAO {
	private DataSource dataFactory;
	
	public BoardDAO() {
		try {
			Context ctx = new InitialContext();
			dataFactory = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle11g");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
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
	
	
	public void insert(BoardDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO myboard (num, author, title, content, repRoot, repStep, repIndent) VALUES(?,?,?,?,?,?,?)";
		
		try {
			conn = dataFactory.getConnection();
			int num = getNum(conn);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, dto.getAuthor());
			pstmt.setString(3, dto.getTitle());
			pstmt.setString(4, dto.getContent());
			pstmt.setInt(5, num);
			pstmt.setInt(6, 0);
			pstmt.setInt(7, 0);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(null, pstmt, conn);
		}
	}

	private int getNum(Connection conn) {
		int num = -1;
		PreparedStatement pstmt = null;
		String sql = "SELECT NVL2(MAX(num), MAX(num)+1, 1) FROM myboard";
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				num = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, null);
		}
		
		return num;
	}

	public List<BoardDTO> list() {
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT num, author, title, "
				+ "to_char(writeday, 'yyyy/mm/dd') writeday, "
				+ "readcnt, repRoot, repStep, repIndent  "
				+ "FROM myboard "
				+ "ORDER BY repRoot desc, repStep asc";
		ResultSet rs = null;
		
		try {
			conn = dataFactory.getConnection();
						
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int num = rs.getInt("num");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String writeday = rs.getString("writeday");
				int readcnt = rs.getInt("readcnt");
				int repRoot = rs.getInt("repRoot");
				int repStep = rs.getInt("repStep");
				int repIndent = rs.getInt("repIndent");
				
				BoardDTO dto = new BoardDTO(num, author, title, null, writeday, readcnt, repRoot, repStep, repIndent);
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, conn);
		}
		
		return list;
	}

	private void increaseReadcnt(Connection conn, int num) {
		PreparedStatement pstmt = null;
		String sql = "UPDATE myboard SET readcnt = readcnt + 1 WHERE num = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(null, pstmt, null);
		}
		
	}

	public BoardDTO read(int num) {
		BoardDTO dto = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM myboard WHERE num = ?";
		ResultSet rs = null;
		
		boolean isOk = false;
		
		try {
			conn = dataFactory.getConnection();
			conn.setAutoCommit(false);
			
			increaseReadcnt(conn, num);
			
			
			
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String author = rs.getString("author");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writeday = rs.getString("writeday");
				int readcnt = rs.getInt("readcnt");
				
				dto= new BoardDTO(num, author, title, content, writeday, readcnt, -1, -1, -1);
			}
			
			
			isOk = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(isOk) {
					conn.commit();
				}else {
					conn.rollback();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			closeAll(rs, pstmt, conn);
		}
		
		
		
		return dto;
	}

	public BoardDTO updateui(int num) {
		BoardDTO dto = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM myboard WHERE num = ?";
		ResultSet rs = null;
		try {
			conn = dataFactory.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String author = rs.getString("author");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writeday = rs.getString("writeday");
				int readcnt = rs.getInt("readcnt");
				int repRoot = rs.getInt("repRoot");
				int repStep = rs.getInt("repStep");
				int repIndent= rs.getInt("repIndent");
				
				dto= new BoardDTO(num, author, title, content, 
						writeday, readcnt, repRoot, repStep, repIndent);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			closeAll(rs, pstmt, conn);
		}
		return dto;
	}

	public void update(BoardDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "UPDATE myboard SET title = ?, author = ?, "
				+ "content=?, writeday=sysdate WHERE num=?";
		try {
			conn = dataFactory.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getAuthor());
			pstmt.setString(3, dto.getContent());
			pstmt.setInt(4, dto.getNum());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(null, pstmt, conn);
		}
		
	}

	public void delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM myboard WHERE num = ?";
		
		try {
			conn = dataFactory.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(null, pstmt, conn);
		}
		
	}

	public List<BoardDTO> search(String searchOption, String searchKeyword) {
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		System.out.println(searchOption);
		System.out.println(searchKeyword);
		Connection conn = null;
		PreparedStatement pstmt = null;
					
		String sql = "SELECT * FROM myboard WHERE UPPER("+searchOption+") LIKE UPPER(?) ORDER BY repRoot DESC, repStep ASC";
					   
		             
		ResultSet rs = null;
		
		try {
			conn = dataFactory.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+searchKeyword+"%");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int num = rs.getInt("num");
				String author = rs.getString("author");
				String title = rs.getString("title");
				String writeday = rs.getString("writeday");
				int readcnt = rs.getInt("readcnt");
				int repIndent = rs.getInt("repIndent");
				
				BoardDTO dto = new BoardDTO(num, author, title, 
						null, writeday, readcnt, -1, -1, repIndent);
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, conn);
		}
		return list;
	}

	public void reply(int oriNum, BoardDTO repDTO) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO myboard "
				+ "(num, author, title, content, repRoot, repStep, repIndent) "
				+ "VALUES (?,?,?,?,?,?,?)";
		
		boolean isOk = false;
		
		try {
			conn = dataFactory.getConnection();

			conn.setAutoCommit(false);
			
			int num = getNum(conn);
			
			BoardDTO oriDTO = updateui(oriNum);
			
			increaseRepStepOtherReply(conn, oriDTO);
			
			
			pstmt = conn.prepareStatement(sql);
			
			
			pstmt.setInt(1, num);
			pstmt.setString(2, repDTO.getAuthor());
			pstmt.setString(3, repDTO.getTitle());
			pstmt.setString(4, repDTO.getContent());
			pstmt.setInt(5, oriDTO.getRepRoot());
			pstmt.setInt(6, oriDTO.getRepStep()+1);
			pstmt.setInt(7, oriDTO.getRepIndent()+1);
			
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
			
			closeAll(null, pstmt, conn);
		}
		
	}

	private void increaseRepStepOtherReply(Connection conn, BoardDTO oriDTO) {
		PreparedStatement pstmt = null;
		String sql = "UPDATE myboard SET repStep = repStep + 1 "
				+ "WHERE repRoot = ? AND repStep > ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, oriDTO.getRepRoot());
			pstmt.setInt(2, oriDTO.getRepStep());
			pstmt.executeUpdate();			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(null, pstmt, null);
		}
		
	}
	
	
	public PageTO page(int curPage) {
		PageTO to = new PageTO(curPage);
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM "
				+ "(SELECT ROWNUM rnum, num, title, author, writeday, readcnt, repIndent FROM "
				+ "(SELECT * FROM myboard order by repRoot desc, repStep asc)) "
				+ "WHERE rnum >= ? AND rnum <= ?";
		ResultSet rs = null;
		
		try {
			conn = dataFactory.getConnection();
			
			int amount = getAmount(conn);
			to.setAmount(amount);
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, to.getStartNum());
			pstmt.setInt(2, to.getEndNum());
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int num = rs.getInt("num");
				String author = rs.getString("author");
				String title = rs.getString("title");
				String writeday = rs.getString("writeday");
				int readcnt = rs.getInt("readcnt");
				int repIndent = rs.getInt("repIndent");
				
				BoardDTO dto = new BoardDTO(num, author, title, 
						null, writeday, readcnt, -1, -1, repIndent);
				list.add(dto);
			
			}
			
			to.setList(list);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, conn);
		}
		
		
		return to;
	}

	private int getAmount(Connection conn) {
		int amount =0;
		PreparedStatement pstmt = null;
		String sql = "select count(num) from myboard";
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs= pstmt.executeQuery();
			if(rs.next()) {
				amount=rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, null);
		}
	
		return amount;
	}
	
	
	
	
	
	
	
	
	
	
}

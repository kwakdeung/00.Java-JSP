package com.study.jsp;

import java.sql.*;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

public class MemberDAO {
	
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String uid = "scott";
	private String upw = "tiger";
	
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<MemberDTO> memberSelect() {
		
		ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {			
			con = DriverManager.getConnection(url, uid, upw);
			stmt = con.createStatement();			
			rs = stmt.executeQuery("select * from member");
			
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String gender = rs.getString("gender");
				
				MemberDTO dto = new MemberDTO(id, pw, name, phone, gender);
				dtos.add(dto);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		return dtos;
	}
	
	public int memberInsert(MemberDTO dto) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String query = "insert into member value (?, ?, ?, ?, ?)";
		int nResult = 0;
		
		try {
			con = DriverManager.getConnection(url, uid, upw);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getPhone());
			pstmt.setString(5, dto.getGender());
			pstmt.executeUpdate();
			nResult = 1;
		} catch (Exception e) {
//			System.out.println( e.getMessage());
//			ORA-00001: unique constraint (SCOTT.SYS_C007030) violated
//			if (e.getMessage().contains("ORA-00001")) {
//				out.println("중복되는 회원아이디 데이터가 있습니다.");
//			}
			e.printStackTrace();
		} finally {
			try {				
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();				
			}
		}
		
		return nResult;
	}
}	


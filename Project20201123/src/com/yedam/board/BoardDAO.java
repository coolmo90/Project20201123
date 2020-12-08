package com.yedam.board;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;
import com.yedam.db2.EmployeeVO;

public class BoardDAO {
	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	
	public List getBoardList() {
		conn = DAO.getConnection();
		sql = "select * from board order by 1";
		List list = new ArrayList();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setBoardNo(rs.getInt("board_no"));
				vo.setTitle(rs.getString("title"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}

	// 한건조회
	public BoardVO getBoard(int boardId) {
		sql = "select * from board where board_no = ?";
		conn = DAO.getConnection();
		EmployeeVO vo = new EmployeeVO();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return vo;

	}

	// 한건입력
	public void insertEmp(EmployeeVO vo) {
		String sql = "insert into emp1(last_name, email, job_id, hire_date, employee_id) values(?,?,?,?,?)";

		try {
			conn = DAO.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, vo.getLastName());
			pstmt.setNString(2, vo.getEmail());
			pstmt.setNString(3, vo.getJobId());
			pstmt.setNString(4, vo.getHireDate());
			pstmt.setInt(5, vo.getEmployeeId());
			int r = pstmt.executeUpdate();// insert, update, delete 할때 executeUpdate 메소드 호출.
			System.out.println(r + "건이 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 한건수정
	

	// 한건삭제
	public void deleteEmp(int empId) {

		sql = "delete from board where board_no = " + empId;
		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 삭제됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

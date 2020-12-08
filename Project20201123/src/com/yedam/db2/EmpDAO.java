package com.yedam.db2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class EmpDAO {
	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;

	// 전체조회

	public List getEmpList() {
		conn = DAO.getConnection();
		sql = "select * from emp1 order by 1";
		List list = new ArrayList();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}

	// 한건조회
	public EmployeeVO getEmp(int empId) {
		sql = "select * from emp1 where employee_id = ?";
		conn = DAO.getConnection();
		EmployeeVO vo = new EmployeeVO();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
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
	public void updateEmp(EmployeeVO vo) {
		if (vo.getSalary() != 0) {
			if (vo.getSalary() != 0) {
				sql = "update emp1" + " set email = nvl('" + vo.getEmail() + "', email)" + ", phone_number = nvl('"
						+ vo.getPhoneNumber() + "', phone_number)" + ", salary = nvl(" + vo.getSalary() + ", salary)"
						+ " where employee_id = " + vo.getEmployeeId();
			} else {
				sql = "update emp1" + " set email = nvl('" + vo.getEmail() + "', email)" + ", phone_number = nvl('"
						+ vo.getPhoneNumber() + "', phone_number)" + " where employee_id = " + vo.getEmployeeId();
			}
			System.out.println(sql);
			conn = DAO.getConnection();
			try {
				pstmt = conn.prepareStatement(sql);
				int r = pstmt.executeUpdate();
				System.out.println(r + "건 수정됨.");
			} catch (SQLException e) {
				e.printStackTrace();
				// 예외-> 반드시한번 실행하겠다
			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}

	// 한건삭제
	public void deleteEmp(int empId) {

		sql = "delete from emp1 where employee_id = " + empId;
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
	// 부서별 정보 조회

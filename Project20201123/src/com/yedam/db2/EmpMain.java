package com.yedam.db2;

import java.util.List;
import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;

public class EmpMain {
	public static void main(String[] args) {
//		List list = new ArrayList();
//		list.add("Hello");
//		list.add("World");
//		list.add("Nice");
//
//		for (Object str : list) {
//			System.out.println(str);
//			// System.out.println(str);
//		}
//		list.add("Good");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		list.get(0); // list[0]
//	}
		Scanner scn = new Scanner(System.in);
		EmpService service = new EmpServiceImpl();
		while (true) {

			System.out.println("---------------------------------------------");
			System.out.println("1.전체조회 2.검색 3.입력 4.수정 5.삭제 6.종료 7.부서별조회");
			System.out.println("---------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scn.nextInt();
			scn.nextLine();
			if (selectNo == 1) {
				List list = service.getEmpList();
				for (Object vo : list) {
					EmployeeVO emp = (EmployeeVO) vo;
					emp.showEmpInfo();
				}
			} else if (selectNo == 2) {
				System.out.println("조회할 사원번호 입력");

				int empId = scn.nextInt();
				EmployeeVO vo = service.getEmp(empId);
				vo.showEmpInfo();

			} else if (selectNo == 3) {
				System.out.println("이름을 입력하세요.");
				String name = scn.nextLine();
				System.out.println("이메일을 입력하세요.");
				String email = scn.nextLine();
				System.out.println("직무를 입력하세요.");
				String jobId = scn.nextLine();
				System.out.println("입사일을 입력하세요.");
				String hireDate = scn.nextLine();
				System.out.println("사원번호를 입력하세요.");
				int employeeId = scn.nextInt();

				EmployeeVO vo = new EmployeeVO(name, email, hireDate, jobId);
				vo.setEmployeeId(employeeId);
				service.insertEmp(vo);

			} else if (selectNo == 4) {
				System.out.println("수정할 사원번호:");
				int empId = scn.nextInt();
				System.out.println("수정할 이메일:");
				scn.nextLine();
				String email = scn.nextLine();
				System.out.println("수정할 전화번호:");
				String phoneNum = scn.nextLine();
				System.out.println("수정할 급여:");
				String salary = scn.nextLine();

				if (salary == null || salary.equals(""))
					salary = "0";
				int sal = Integer.parseInt(salary);

				// int salary = scn.nextInt();

				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(empId);
				vo.setEmail(email);
				vo.setPhoneNumber(phoneNum);
				vo.setSalary(sal);
				// vo.setSalary(salary);
				service.updateEmp(vo);

			} else if (selectNo == 5) {
				System.out.println("삭제할 사원의 번호를 입력하세요.");
				int empId = scn.nextInt();
				service.deleteEmp(empId);

			} else if (selectNo == 6) {
				break;
			} else if (selectNo == 7 ) {
				System.out.println("부서별 조회");
				
			}
		}
		System.out.println("종료합니다.");
	}
}
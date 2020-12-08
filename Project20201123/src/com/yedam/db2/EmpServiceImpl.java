package com.yedam.db2;

import java.util.List;

public class EmpServiceImpl implements EmpService {

	EmpDAO dao = new EmpDAO();
	
	@Override
	public List getEmpList() {
		// TODO Auto-generated method stub
		return dao.getEmpList();
	}

	@Override
	public EmployeeVO getEmp(int empId) {
		// TODO Auto-generated method stub
		return dao.getEmp(empId);
	}

	@Override
	public void insertEmp(EmployeeVO empVo) {
		// TODO Auto-generated method stub
		dao.insertEmp(empVo);
	}

	@Override
	public void updateEmp(EmployeeVO empVo) {
		// TODO Auto-generated method stub
		dao.updateEmp(empVo);
	}

	@Override
	public void deleteEmp(int empId) {
		// TODO Auto-generated method stub
		dao.deleteEmp(empId);
	}

	@Override
	public List<EmployeeVO> getDeptList(String dept) {
		// TODO Auto-generated method stub
		return null;
	}


	
}

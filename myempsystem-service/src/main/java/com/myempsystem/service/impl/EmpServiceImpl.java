package com.myempsystem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myempsystem.dao.IEmpDao;
import com.myempsystem.entity.TbEmp;
import com.myempsystem.service.IEmpService;

@Service("empService")
@Transactional(propagation=Propagation.REQUIRED)
public class EmpServiceImpl implements IEmpService {

	@Resource(name="empDao")
	private IEmpDao empDao;
	@Override
	public boolean addEmp(TbEmp emp) {
		return empDao.addEmp(emp);
	}

	@Override
	public List findEmpList() {
		return empDao.findEmpList();
	}
	
	@Override
	public TbEmp getEepId(int eno) {
		
		return empDao.getEepId(eno);
	}

	@Override
	public boolean deleteEmpte(TbEmp emp) {
		
		return empDao.deleteEmpte(emp);
	}

	@Override
	public boolean updateDept(TbEmp emp) {
		
		return empDao.updateDept(emp);
	}
	

	public void setEmpDao(IEmpDao empDao) {
		this.empDao = empDao;
	}

	
}

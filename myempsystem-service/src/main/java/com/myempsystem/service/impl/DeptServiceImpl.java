package com.myempsystem.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myempsystem.dao.IDeptDao;
import com.myempsystem.entity.TbDept;
import com.myempsystem.service.IDeptService;

@Service("deptService")
@Transactional(propagation=Propagation.REQUIRED)
public class DeptServiceImpl implements IDeptService {

	@Resource(name="deptDao")
	private IDeptDao deptDao;
	
	@Override
	public boolean addDept(TbDept dept) {
		return deptDao.addDept(dept);
	}

	@Override
	public List findDeptList() {
		return deptDao.findDeptList("from TbDept");
	}

	public void setDeptDao(IDeptDao deptDao) {
		this.deptDao = deptDao;
	}

}

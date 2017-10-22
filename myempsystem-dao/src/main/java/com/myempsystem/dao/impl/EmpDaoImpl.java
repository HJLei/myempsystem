package com.myempsystem.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.myempsystem.dao.IEmpDao;
import com.myempsystem.entity.TbEmp;

@Repository("empDao")
public class EmpDaoImpl extends BaseDao implements IEmpDao {

	@Override
	public boolean addEmp(TbEmp emp) {
		try {
			getSession().save(emp);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List findEmpList() {
		return getSession().createQuery("from TbEmp e left join e.dept").list();
	}

	@Override
	public TbEmp getEepId(int eno) {
		
		return getSession().get(TbEmp.class, eno);
	}

	@Override
	public boolean deleteEmpte(TbEmp emp) {
		try {
			getSession().delete(emp);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean updateDept(TbEmp emp) {
		try {
			getSession().update(emp);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}

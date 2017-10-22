package com.myempsystem.dao;

import java.util.List;

import com.myempsystem.entity.TbDept;



public interface IDeptDao {

	public boolean addDept(TbDept dept);
	
	
	public List findDeptList(String hql);
}

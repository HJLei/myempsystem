package com.myempsystem.service;

import java.util.List;

import com.myempsystem.entity.TbDept;

public interface IDeptService {

	public boolean addDept(TbDept dept);
	
	public List findDeptList();
}

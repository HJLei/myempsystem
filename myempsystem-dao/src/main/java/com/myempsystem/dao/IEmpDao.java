package com.myempsystem.dao;

import java.util.List;

import com.myempsystem.entity.TbEmp;



public interface IEmpDao {

	/**添加**/
	public boolean addEmp(TbEmp emp);
	
	/**查询**/
	public List findEmpList();
	
	/**根据ID查询**/
	public TbEmp getEepId(int eno);
	
	/**删除**/
	public boolean deleteEmpte(TbEmp emp);
	
	/**修改**/
	public boolean updateDept(TbEmp emp);
	
}

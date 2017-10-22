package com.myempsystem.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.myempsystem.entity.TbDept;
import com.myempsystem.service.IDeptService;
import com.opensymphony.xwork2.ActionContext;

@Controller("deptAction")
@Scope("prototype")
public class DeptAction {

	private TbDept dept;
	private List deptList;
	
	private int msg;
	
	//依赖IDeptService
	@Resource(name="deptService")
	private IDeptService deptService;
	
	//添加部门
	public String addDept(){
		if(deptService.addDept(dept)){
			msg=1;
		}else{
			msg=-1;
		}
		return "addDept";
	}

	//查询部门
	public String findDeptList(){
		ActionContext.getContext().put("deptList", deptService.findDeptList());
		return "deptList";
	}
	public TbDept getDept() {
		return dept;
	}

	public void setDept(TbDept dept) {
		this.dept = dept;
	}

	public void setDeptService(IDeptService deptService) {
		this.deptService = deptService;
	}

	public List getDeptList() {
		return deptList;
	}

	public void setDeptList(List deptList) {
		this.deptList = deptList;
	}

	public int getMsg() {
		return msg;
	}

	public void setMsg(int msg) {
		this.msg = msg;
	}
	
	
}

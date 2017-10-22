package com.myempsystem.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.myempsystem.entity.TbEmp;
import com.myempsystem.service.IDeptService;
import com.myempsystem.service.IEmpService;
import com.opensymphony.xwork2.ActionContext;

@Controller("empAction")
@Scope("prototype")
public class EmpAction {
	
	private TbEmp emp;
	private int msg;
	
	@Resource(name="deptService")
	private IDeptService deptService;
	@Resource(name="empService")
	private IEmpService empService;
	
	//去到添加员工的方法
	public String toAddEmp(){
		List deptList=deptService.findDeptList();
		ActionContext.getContext().put("deptList", deptList);
		return "addEmp";
	}
	
	//添加员工
	public String addEmp(){
		if(empService.addEmp(emp)){
			msg=1;
		}else{
			msg=-1;
		}
		return "toAddEmp";
	}
	
	//查询员工
	public String findEmps(){
		List empList=empService.findEmpList();
		ActionContext.getContext().put("empList", empList);
		return "empList";
	}

	//去到修改页面
	public String toUpdatedEmps(){
		List deptList=deptService.findDeptList();
		ActionContext.getContext().put("deptList", deptList);
		emp=empService.getEepId(emp.getEno());
		return "toUpdatedEmps";
	}
	
	//执行修改
	public String doUpdateEmp(){
		if(empService.updateDept(emp)){
			msg=2;
		}else{
			msg=3;
		}
		return "doUpdateEmp";
	}
		
	//删除
	public String deleteEmp(){
		if(empService.deleteEmpte(emp)){
			msg=1;
		}else{
			msg=-1;
		}
		return "deleteEmp";
	}
	public TbEmp getEmp() {
		return emp;
	}

	public void setEmp(TbEmp emp) {
		this.emp = emp;
	}

	public void setDeptService(IDeptService deptService) {
		this.deptService = deptService;
	}

	public void setEmpService(IEmpService empService) {
		this.empService = empService;
	}

	public int getMsg() {
		return msg;
	}

	public void setMsg(int msg) {
		this.msg = msg;
	}
	
}








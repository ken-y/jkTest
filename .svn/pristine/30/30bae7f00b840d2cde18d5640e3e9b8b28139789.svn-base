package cn.you.jk.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import cn.you.jk.domain.Contract;
import cn.you.jk.pagination.Page;

public interface ContractService  {

	public List<Contract> findPage(Page page); //分页查询
	public List<Contract> find(Map paraMap);   //带条件查询，条件可以为null，即没有条件，返回list对象
	public Contract get(Serializable id);  	//只查询一个，常用于修改
	public void insert(Contract contract);		//插入实体类
	public void update(Contract contract);		
	public void deleteById(Serializable id);
	public void delete(Serializable[] ids); //批量删除，支持整数型和字符窜类型ID
	
	public void submit(Serializable[] ids);//上报
	public void cancel(Serializable[] ids);//取消
	
}

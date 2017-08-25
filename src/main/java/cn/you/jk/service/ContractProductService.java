package cn.you.jk.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import cn.you.jk.domain.ContractProduct;
import cn.you.jk.pagination.Page;

public interface ContractProductService  {

	public List<ContractProduct> findPage(Page page); //分页查询
	public List<ContractProduct> find(Map paraMap);   //带条件查询，条件可以为null，即没有条件，返回list对象
	public ContractProduct get(Serializable id);  	//只查询一个，常用于修改
	public void insert(ContractProduct contractProduct);		//插入实体类
	public void update(ContractProduct contractProduct);		
	public void deleteById(Serializable id);
	public void delete(Serializable[] ids); //批量删除，支持整数型和字符窜类型ID
	
	
	
}

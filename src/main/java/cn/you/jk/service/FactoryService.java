package cn.you.jk.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import cn.you.jk.domain.Factory;
import cn.you.jk.pagination.Page;

public interface FactoryService  {

	public List<Factory> findPage(Page page); //分页查询
	public List<Factory> find(Map paraMap);   //带条件查询，条件可以为null，即没有条件，返回list对象
	public Factory get(Serializable id);  	//只查询一个，常用于修改
	public void insert(Factory entity);		//插入实体类
	public void update(Factory entity);		
	public void deleteById(Serializable id);
	public void delete(Serializable[] ids); //批量删除，支持整数型和字符窜类型ID
	
	public void start(Serializable[] ids);//启用
	public void stop(Serializable[] ids);//停用
	public List<Factory> getFactoryList(); //获取生产厂家列表
}

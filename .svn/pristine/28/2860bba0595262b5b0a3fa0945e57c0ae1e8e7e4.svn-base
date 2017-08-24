package cn.you.jk.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import cn.you.jk.pagination.Page;

public interface BaseDao<T> {
	public List<T> findPage(Page page); //分页查询
	public List<T> find(Map paraMap);   //带条件查询，条件可以为null，即没有条件，返回list对象
	public T get(Serializable id);  	//只查询一个，常用于修改
	public void insert(T entity);		//插入实体类
	public void update(T entity);		
	public void deleteById(Serializable id);
	public void delete(Serializable[] ids); //批量删除，支持整数型和字符窜类型ID

}

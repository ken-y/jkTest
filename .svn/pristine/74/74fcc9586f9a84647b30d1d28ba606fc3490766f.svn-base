package cn.you.jk.dao;

import java.util.Map;

import cn.you.jk.domain.Factory;

public interface FactoryDao extends BaseDao<Factory> {
	//这里可以直接使用继承的BaseDao的增删改查
	//创建一系列其他Dao的原因是因为其它Dao有可能需要扩展
	
	public void updateState(Map map);//修改状态
}

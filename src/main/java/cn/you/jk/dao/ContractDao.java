package cn.you.jk.dao;

import java.util.Map;

import cn.you.jk.domain.Contract;

public interface ContractDao extends BaseDao<Contract> {
	
	//直接使用继承的Basedao的增删改查方法
	//创建一系列其他的dao的原因是因为其它dao有可能需要拓展
	
	public void updateState(Map map);//修改状态
}

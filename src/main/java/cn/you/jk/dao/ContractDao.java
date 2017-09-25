package cn.you.jk.dao;

import java.io.Serializable;
import java.util.Map;

import cn.you.jk.domain.Contract;
import cn.you.jk.vo.ContractVO;

public interface ContractDao extends BaseDao<Contract> {
	
	//直接使用继承的Basedao的增删改查方法
	//创建一系列其他的dao的原因是因为其它dao有可能需要拓展
	
	public void updateState(Map map);//修改状态
	
	//拓展的级联删除方法
	public void deleteByContractById(Serializable[] ids)throws Exception;
	public void deleteExtByContractById(Serializable[] ids)throws Exception;
	
	//查询合同加关联关系的详细信息
	public ContractVO view(String contractId);
}

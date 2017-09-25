package cn.you.jk.dao;

import java.io.Serializable;

import cn.you.jk.domain.ContractProduct;

public interface ContractProductDao extends BaseDao<ContractProduct> {
	
	//拓展的级联删除方法
	public void deleteByContractProductById(Serializable[] ids) throws Exception;

}

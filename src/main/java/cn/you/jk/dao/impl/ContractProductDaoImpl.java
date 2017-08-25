package cn.you.jk.dao.impl;

import org.springframework.stereotype.Repository;

import cn.you.jk.dao.ContractProductDao;
import cn.you.jk.domain.ContractProduct;

@Repository
public class ContractProductDaoImpl  extends BaseDaoImpl<ContractProduct> implements ContractProductDao{
	
	public ContractProductDaoImpl(){
		//设置命名空间
		super.setNs("cn.you.jk.mapper.ContractProductMapper");
	}

}

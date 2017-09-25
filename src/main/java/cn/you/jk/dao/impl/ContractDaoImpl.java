package cn.you.jk.dao.impl;

import java.io.Serializable;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.you.jk.dao.ContractDao;
import cn.you.jk.domain.Contract;
import cn.you.jk.vo.ContractVO;

@Repository
public class ContractDaoImpl extends BaseDaoImpl<Contract> implements ContractDao{

	public  ContractDaoImpl() {
		//设置，命名空间
		super.setNs("cn.you.jk.mapper.ContractMapper");
	}
	@Override
	public void updateState(Map map) {
		super.getSqlSession().update(super.getNs()+".updateState",map);
	}
	@Override
	public void deleteByContractById(Serializable[] ids) throws Exception {
		super.getSqlSession().update(super.getNs()+".deleteByContractById",ids);
	}
	@Override
	public void deleteExtByContractById(Serializable[] ids) throws Exception {
		super.getSqlSession().update(super.getNs()+".deleteExtByContractById",ids);
	}
	@Override
	public ContractVO view(String contractId) {
		return super.getSqlSession().selectOne(super.getNs()+".view",contractId);
	}
	

}

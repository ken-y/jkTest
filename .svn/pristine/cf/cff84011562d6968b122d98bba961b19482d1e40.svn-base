package cn.you.jk.dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.you.jk.dao.ContractDao;
import cn.you.jk.domain.Contract;

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
	

}

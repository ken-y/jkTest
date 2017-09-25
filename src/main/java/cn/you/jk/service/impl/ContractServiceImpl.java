package cn.you.jk.service.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import cn.you.jk.dao.ContractDao;
import cn.you.jk.domain.Contract;
import cn.you.jk.pagination.Page;
import cn.you.jk.service.ContractService;
import cn.you.jk.vo.ContractVO;

@Service("contractService")
public class ContractServiceImpl implements ContractService{

	@Resource
	ContractDao contractDao;
	
	@Override
	public List<Contract> findPage(Page page) {
		// TODO Auto-generated method stub
		return contractDao.findPage(page);
	}

	@Override
	public List<Contract> find(Map paraMap) {
		// TODO Auto-generated method stub
		return contractDao.find(paraMap);
	}

	@Override
	public Contract get(Serializable id) {
		// TODO Auto-generated method stub
		return contractDao.get(id);
	}

	@Override
	public void insert(Contract contract) {
		contract.setId(UUID.randomUUID().toString());
		contract.setState(0);
		contractDao.insert(contract);
	}

	@Override
	public void update(Contract contract) {
		contractDao.update(contract);
	}

	@Override
	public void deleteById(Serializable id) {
		Serializable[] ids={id};
		try {
			//删除合同是删除合同货物下的所有附件
			contractDao.deleteExtByContractById(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			contractDao.deleteByContractById(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
		contractDao.deleteById(id);
	}

	@Override
	public void delete(Serializable[] ids) {
		try {
			//删除合同是删除合同货物下的所有附件
			contractDao.deleteExtByContractById(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		try {
			//删除合同时同时删除合同下的货物
			contractDao.deleteByContractById(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
		contractDao.delete(ids);
	}

	@Override
	public void submit(Serializable[] ids) {
		 //默认刚建完的是草稿，建完之后确定没问题就上报  
        //0草稿 1已上报
		Map map=new HashMap<>();
		map.put("state", 1);   //1已上报
		map.put("ids", ids);
		contractDao.updateState(map);
	}

	@Override
	public void cancel(Serializable[] ids) {
		Map map=new HashMap<>();
		map.put("state", 0);   //0取消
		map.put("ids", ids);
		contractDao.updateState(map);
	}

	@Override
	public ContractVO view(String contractId) {
		
		return contractDao.view(contractId);
	}

	
	

}

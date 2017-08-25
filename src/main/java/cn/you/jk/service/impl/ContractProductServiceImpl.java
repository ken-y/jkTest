package cn.you.jk.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.you.jk.dao.ContractProductDao;
import cn.you.jk.domain.ContractProduct;
import cn.you.jk.pagination.Page;
import cn.you.jk.service.ContractProductService;

@Service("contractProductService")
public class ContractProductServiceImpl implements ContractProductService {

	@Resource
	ContractProductDao contractProductDao;

	@Override
	public List<ContractProduct> findPage(Page page) {
		
		return contractProductDao.findPage(page);
	}

	@Override
	public List<ContractProduct> find(Map paraMap) {
		
		return contractProductDao.find(paraMap);
	}

	@Override
	public ContractProduct get(Serializable id) {
		
		return contractProductDao.get(id);
	}

	@Override
	public void insert(ContractProduct contractProduct) {
		//设置UUID
		contractProduct.setId(UUID.randomUUID().toString());
		contractProductDao.insert(contractProduct);
	}

	@Override
	public void update(ContractProduct contractProduct) {
		
		contractProductDao.update(contractProduct);
		
	}

	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Serializable[] ids) {
		// TODO Auto-generated method stub
		
	}
	
	
}

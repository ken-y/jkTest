package cn.you.jk.service.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.you.jk.dao.FactoryDao;
import cn.you.jk.domain.Factory;
import cn.you.jk.pagination.Page;
import cn.you.jk.service.FactoryService;

@Service("factoryService")
public class FactoryServiceImpl implements FactoryService{
	@Resource
	FactoryDao factoryDao;


	@Override
	public List<Factory> findPage(Page page) {
		
		return null;
	}

	@Override
	public List<Factory> find(Map paraMap) {

		return factoryDao.find(paraMap);
	}

	@Override
	public Factory get(Serializable id) {

		return factoryDao.get(id);
	}

	@Override
	public void insert(Factory entity) {
		entity.setId(UUID.randomUUID().toString());
		entity.setState("1");//默认为启用状态
		factoryDao.insert(entity);
		
	}

	@Override
	public void update(Factory entity) {

		factoryDao.update(entity);
	}

	@Override
	public void deleteById(Serializable id) {
		factoryDao.deleteById(id);
		
	}

	@Override
	public void delete(Serializable[] ids) {
		factoryDao.delete(ids);
		
	}

	@Override
	public void start(Serializable[] ids) {
		Map map=new HashMap();
		map.put("state", 1);//启用
		map.put("ids", ids);
		
		factoryDao.updateState(map);
		
	}

	@Override
	public void stop(Serializable[] ids) {
		Map map=new HashMap();
		map.put("state", 0);//停用
		map.put("ids", ids);
		
		factoryDao.updateState(map);
	}

}

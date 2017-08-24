package cn.you.jk.dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.you.jk.dao.FactoryDao;
import cn.you.jk.domain.Factory;
@Repository
public class FactoryDaoImpl extends BaseDaoImpl<Factory> implements FactoryDao {

	public FactoryDaoImpl(){  
        //设置命名空间  
        super.setNs("cn.you.jk.mapper.FactoryMapper");  
    }

	@Override
	public void updateState(Map map) {
		super.getSqlSession().update(super.getNs()+".updateState",map);
	}  
}

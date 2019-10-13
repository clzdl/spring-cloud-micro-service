package com.microservice.provider.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.framework.mybatis.service.AbastractBizService;
import com.microservice.common.persistence.entity.ScUser;
import com.microservice.provider.service.IUserService;

@Service
public class UserServiceImpl extends AbastractBizService<ScUser> implements IUserService {

	protected UserServiceImpl() {
		super(ScUser.class);
	}

	@Override
	protected Map<Long, ScUser> list2Map(List<ScUser> list) {
		return null;
	}

	@Override
	public void addUser(ScUser user) throws Exception {
		System.out.println("provider2");
		super.insert(user);
	}

	@Override
	public ScUser getUser(Long id) throws Exception {
		System.out.println("provider2");
		return super.getById(id);
	}

	@Override
	public List<ScUser> getUsers() throws Exception {
		System.out.println("provider2");
		return super.listAll();
	}

}

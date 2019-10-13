package com.microservice.provider.service;

import java.util.List;

import com.framework.mybatis.service.IBizService;
import com.microservice.common.persistence.entity.ScUser;

public interface IUserService extends IBizService<ScUser> {
	void addUser(ScUser user) throws Exception;

	ScUser getUser(Long id) throws Exception;

	List<ScUser> getUsers() throws Exception;
}

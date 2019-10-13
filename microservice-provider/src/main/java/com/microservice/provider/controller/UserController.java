package com.microservice.provider.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.framework.common.auth.BaseUserContext;
import com.framework.common.web.controller.AbstractBaseController;
import com.microservice.common.persistence.entity.ScUser;
import com.microservice.provider.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController extends AbstractBaseController {

	@Resource
	private IUserService userService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void addUser(@RequestBody ScUser user, HttpServletResponse response) throws Exception {
		userService.addUser(user);
		ajaxSuccess(response);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public void getUser(@PathVariable("id") Long id, HttpServletResponse response) throws Exception {
		ScUser data = userService.getUser(id);
		ajaxSuccess(response, data);
	}

	@RequestMapping(value = "/get/list", method = RequestMethod.GET)
	public void getUsers(HttpServletResponse response) throws Exception {
		List<ScUser> data = userService.getUsers();
		ajaxSuccess(response, data);
	}

	@Override
	public BaseUserContext getCurrentUserContext() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

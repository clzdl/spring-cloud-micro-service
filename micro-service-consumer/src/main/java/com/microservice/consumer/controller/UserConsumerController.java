package com.microservice.consumer.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.framework.common.auth.BaseUserContext;
import com.framework.common.web.controller.AbstractBaseController;
import com.microservice.common.persistence.entity.ScUser;

@Controller
@RequestMapping("/user")
public class UserConsumerController extends AbstractBaseController {

	private static String REST_URL_PREFIX = "http://microservicecloud-provider/user";
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/consumer/add")
	public void addUser(ScUser user, HttpServletResponse response) throws Exception {
		restTemplate.postForObject(REST_URL_PREFIX + "/add", user, Boolean.class);
		ajaxSuccess(response);
	}

	@RequestMapping(value = "/consumer/get/{id}")
	public void get(@PathVariable("id") int id, HttpServletResponse response) throws Exception {
		String data = restTemplate.getForObject(REST_URL_PREFIX + "/get" + "/id", String.class);
		ajaxSuccess(response, data);
	}

	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/consumer/list")
	public void getList(HttpServletResponse response) throws Exception {
		String data = restTemplate.getForObject(REST_URL_PREFIX + "/get/list", String.class);

		ajaxSuccess(response, data);
	}

	@Override
	public BaseUserContext getCurrentUserContext() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

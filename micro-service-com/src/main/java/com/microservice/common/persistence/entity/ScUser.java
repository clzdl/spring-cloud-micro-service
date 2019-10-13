package com.microservice.common.persistence.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sc_user")
public class ScUser {
	/**
	 * 用户
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 年龄
	 */
	private Byte age;

	/**
	 * 创建时间
	 */
	@Column(name = "create_time")
	private Date createTime;

	/**
	 * 获取用户
	 *
	 * @return id - 用户
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 设置用户
	 *
	 * @param id 用户
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 获取姓名
	 *
	 * @return name - 姓名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置姓名
	 *
	 * @param name 姓名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取年龄
	 *
	 * @return age - 年龄
	 */
	public Byte getAge() {
		return age;
	}

	/**
	 * 设置年龄
	 *
	 * @param age 年龄
	 */
	public void setAge(Byte age) {
		this.age = age;
	}

	/**
	 * 获取创建时间
	 *
	 * @return create_time - 创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置创建时间
	 *
	 * @param createTime 创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
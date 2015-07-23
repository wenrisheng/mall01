package com.wl.mall.service;

import com.wl.mall.model.User;
import com.wl.mall.module.common.dao.BaseDao;

public interface UserService extends BaseDao<User> {

	public abstract void registerUser(String account, String password);
	public abstract User getUser(Long id);
	public abstract void deleteUser(Long id);
}
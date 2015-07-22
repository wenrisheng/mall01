package com.wl.mall.service;

import org.springframework.transaction.annotation.Transactional;

import com.wl.mall.model.User;

public interface UserService {

	public abstract void saveUser(User user);

}
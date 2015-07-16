package com.wl.mall.module.user.service;

import org.springframework.stereotype.Service;

public interface UserService {
	public abstract void registerUser(String account, String password);
}

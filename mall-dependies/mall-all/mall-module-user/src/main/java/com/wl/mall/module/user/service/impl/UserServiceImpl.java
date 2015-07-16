package com.wl.mall.module.user.service.impl;

import org.springframework.stereotype.Service;

import com.wl.mall.module.common.service.impl.BaseServiceImpl;
import com.wl.mall.module.user.model.User;
import com.wl.mall.module.user.service.UserService;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

	@Override
	public void registerUser(String account, String password) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setAccount(account);
		user.setPassword(password);
		this.save(user);
	}

	

}

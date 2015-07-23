package com.wl.mall.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wl.mall.model.User;
import com.wl.mall.module.common.service.impl.BaseServiceImpl;
import com.wl.mall.service.UserService;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements
		UserService {

	@Override
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
	public void registerUser(String account, String password) {
		User user = new User();
		user.setAccount(account);
		user.setPassword(password);
		this.save(user);
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return baseDao.get(User.class, id);
	}

	@Override
	@Transactional
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		this.delete(this.get(User.class, id));
	}

}

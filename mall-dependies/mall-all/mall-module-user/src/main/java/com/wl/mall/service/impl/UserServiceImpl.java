package com.wl.mall.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.wl.mall.model.User;
import com.wl.mall.module.common.dao.BaseDao;
import com.wl.mall.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	BaseDao<User> baseDao;
	
	/* (non-Javadoc)
	 * @see com.wl.mall.service.impl.UserService#saveUser(com.wl.mall.model.User)
	 */
	@Override

public void saveUser(User user) {
	baseDao.save(user);
}
}

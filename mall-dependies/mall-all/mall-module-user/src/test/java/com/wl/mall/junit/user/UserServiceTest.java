package com.wl.mall.junit.user;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wl.mall.model.User;
import com.wl.mall.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext_module_user_test.xml"})
public class UserServiceTest {

	@Resource
	private UserService userService;
	@Test
	public void testSaveUser() {
		User user = new User("wrs", "123455");
		userService.saveUser(user);
	}

}

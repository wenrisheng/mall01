package com.wl.mall.module.user.test;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.wl.mall.module.common.dao.BaseDao;
import com.wl.mall.module.user.service.UserService;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {
//       // "classpath:/META-INF/spring/applicationContext.xml",
//         "classpath:applicationContext-module-user-test.xml"
//       // "file:src/main/webapp/WEB-INF/spring/webmvc-config.xml"
//
// })
//@WebAppConfiguration
public class TestUserService {
	 
	    private ApplicationContext applicationContext;
	@Test
	public void testRegisterUser() {
		applicationContext = new ClassPathXmlApplicationContext("applicationContexttest.xml");
		
		UserService userService = (UserService)applicationContext.getBean("userService");
		userService.registerUser("wenrisheng", "123456");
	}

}

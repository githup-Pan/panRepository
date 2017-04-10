package com.heltong.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hletong.dao.dto.UserDto;
import com.hletong.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)   //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class MybatisTest {
	
//	private static Logger logger = Logger.getLogger(MybatisTest.class);
	
//	private ApplicationContext ac;
	@Autowired
	private IUserService userService;
	
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
//  }  
	@Test
	public void test1() {
	//	 UserDto cond = new UserDto();
	//	 cond.setId(2);
//		  List<UserDto> list = userService.getUserDtoById(cond);
	//	  System.out.println("search num is :"+list.size());
//		  logger.info(list.get(0).getUesrName());
		  UserDto dto = userService.getUserInfoByName("pan3ht", "123456");
		  System.out.println(dto);
	}
}

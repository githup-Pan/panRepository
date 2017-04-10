package com.hletong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hletong.dao.IUserDao;
import com.hletong.dao.dto.UserDto;
import com.hletong.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private IUserDao userDao;

	@Override
	public List<UserDto> getUserDtoById(UserDto cond) {
		
		return userDao.queryUserTest(cond);
	}
	
	public UserDto getUserInfoByName(String userName, String password) {
		
		return userDao.getUserDtoByName(userName, password);
	}

	@Override
	public int addUser(UserDto userDto) {
		return userDao.insertTest(userDto);
	}
}

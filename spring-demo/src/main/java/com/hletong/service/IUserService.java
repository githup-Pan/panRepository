package com.hletong.service;

import java.util.List;

import com.hletong.dao.dto.UserDto;

public interface IUserService {
	
	public List<UserDto> getUserDtoById(UserDto cond);
	
	
	public UserDto getUserInfoByName(String userName, String password);
	
	public int addUser(UserDto userDto);
}

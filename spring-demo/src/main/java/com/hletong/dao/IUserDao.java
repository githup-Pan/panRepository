package com.hletong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.hletong.dao.dto.UserDto;

@Repository
public interface IUserDao {
	/**
	 * 方法名与Mapper.xml中的id对应
	 * @param cond
	 * @return
	 */
	public List<UserDto> queryUserTest(UserDto cond);
	
	public int insertTest(UserDto dto);
	
	public int updateTest(UserDto dto);
	  
	public int countTest(UserDto cond);
	
	/**
	 * 此处用注解标记，在xml就能用名称获取
	 * @param userName
	 * @return
	 */
	public int deleteTest(@Param("userName") String userName);
	
	public UserDto getUserDtoByName(@Param("userName")String userName, @Param("password")String password);
}

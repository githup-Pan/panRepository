package com.hletong.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hletong.dao.dto.UserDto;
import com.hletong.service.IUserService;

@Controller
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	private IUserService userService;	
	
	@RequestMapping("do")
	public String doRegister(HttpServletRequest request,HttpServletResponse response, Model model) {
		String phoneNum = request.getParameter("phoneNum");
		String userName = request.getParameter("username");
		String password1 = request.getParameter("password1");
		String password2 = request.getParameter("password2");
		UserDto dtoInfo1 = userService.getUserInfoByName(userName, null);
		UserDto dtoInfo2 = userService.getUserInfoByName(phoneNum, null);
		boolean flag = (dtoInfo1 != null || dtoInfo2 != null);
		if (flag) {
			model.addAttribute("error", "用户名已经被注册 , 请重新输入");
			return "register";
		}
		if (!StringUtils.isEmpty(phoneNum)) {
			UserDto userDto = new UserDto();
			userDto.setUserName(phoneNum);
			userDto.setPassword(password1);
			userDto.setAge(18);
			userService.addUser(userDto);
			
		} else {
			UserDto userDto = new UserDto();
			userDto.setUserName(userName);
			userDto.setPassword(password2);
			userDto.setAge(18);
			userService.addUser(userDto);
		}
		return "success";
	}
}

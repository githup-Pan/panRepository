package com.hletong.controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hletong.dao.dto.UserDto;
import com.hletong.service.IUserService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value = "do", method = RequestMethod.POST)
	public String doLogin(HttpServletRequest request,HttpServletResponse response, Model model) {
		
		String phoneNum = request.getParameter("phoneNum");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		UserDto dtoInfo1 = userService.getUserInfoByName(userName, password);
		UserDto dtoInfo2 = userService.getUserInfoByName(phoneNum, password);
		boolean flag = (dtoInfo1 == null && dtoInfo2 == null);
		if (flag) {
			model.addAttribute("error", "用户名或者密码错误 , 请重新输入");
			return "login";
		}
		if (dtoInfo1 != null) {
			session.setAttribute("username", userName);
			request.setAttribute("userMsg", dtoInfo1);
			
		} else {
			session.setAttribute("username", phoneNum);
			request.setAttribute("userMsg", dtoInfo2);
		}
		return "success";
	}
	
	
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String doregister() {
		return "register";
	}
}

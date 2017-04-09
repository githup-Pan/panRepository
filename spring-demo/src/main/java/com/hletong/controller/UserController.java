package com.hletong.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hletong.dao.dto.UserDto;
import com.hletong.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/show")
	public String toIndex(HttpServletRequest request, Model model) {
		int userId = Integer.parseInt(request.getParameter("id"));
		UserDto condDto = new UserDto();
		condDto.setId(userId);
		List<UserDto> list = userService.getUserDtoById(condDto);
		model.addAttribute("user", list.get(0));
		return "index";
	}
}

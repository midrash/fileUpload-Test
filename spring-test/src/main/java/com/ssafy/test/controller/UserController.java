package com.ssafy.test.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssafy.test.dto.UserInfo;
import com.ssafy.test.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;
	
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "index";
	}
	
	@PostMapping("/login")
	public String login(UserInfo userInfo, HttpSession session, Model model) {
		try {
			UserInfo user = service.login(userInfo);
			if (user != null) {
				session.setAttribute("loginUser", user);
				// /WEB-INF/views/country/regist.jsp
				return "country/regist";
			} else {
				// .. 로그인 실패시 : /WEB-INF/views/index.jsp
				return "index";
			}
		} catch (Exception e) {
			model.addAttribute("errorMsg", ".....");
			return "error/error";
		}
	}
}

package com.ssafy.test.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssafy.test.dto.UserInfo;
import com.ssafy.test.service.UserService;

@CrossOrigin(origins = "*")
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
	/**
	 * �������� ��� : ���� , ����� ���� : UserInfo��ü - json��ü
	 * �������� �ܿ� : ���� , 
	 * @param userInfo
	 * @param session
	 * @param model
	 * @return
	 * @throws Exception 
	 */
	
	@PostMapping("/login.do")
	@ResponseBody // �ޙ��� ����� �ܼ��� �޽����� �ѱ�ڴ�
	public Map<String,Object> login(UserInfo userInfo) throws Exception {
		System.out.println(333);
		Map<String,Object> result = new HashMap<>();
		try {
			UserInfo user = service.login(userInfo);
			if (user != null) {
				result.put("result", "1"); // ����
				result.put("user", user);
				// /WEB-INF/views/country/regist.jsp
			} else {
				result.put("result", "0");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return result;
	}
}

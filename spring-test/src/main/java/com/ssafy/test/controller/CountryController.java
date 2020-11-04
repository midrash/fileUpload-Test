package com.ssafy.test.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssafy.test.dto.CountryStatus;
import com.ssafy.test.service.CountryService;

@Controller
@RequestMapping("/country")
public class CountryController {
	@Autowired
	private CountryService service;
	
	@GetMapping("/regist")
	public void registForm() {}
	
	
	@PostMapping("/regist")
	public String insertCountryStatus(CountryStatus countryStatus, Model model) {
		try {
			service.insertCountryStatus(countryStatus);
			return "country/result";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", "현황 등록 중 오류가 발생했습니다");
			return "error/error";
		}
	}
	
	@GetMapping("/deletes")
//	public String deleteCountryStatus(ArrayList<String> ccodes) {
	public String deleteCountryStatus(String[] ccodes) {
		
		System.out.println(ccodes.length);
		
		service.deleteCountryStatus(ccodes);
		// 삭제후 이동할 페이지
		return "redirect:list";
	}

	@GetMapping("/list")
	public void selectCountryStatus(Model model) {
		model.addAttribute("list", service.selectCountryStatus());
	}
	
	@GetMapping("/detail")
	public void selectCountryStatusByCcode(String ccode, Model model) {
		model.addAttribute("countryStatus", service.selectCountryStatusByCcode(ccode));
	}
}






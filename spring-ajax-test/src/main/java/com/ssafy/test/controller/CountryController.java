package com.ssafy.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssafy.test.dto.CountryStatus;
import com.ssafy.test.service.CountryService;

@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/country")
public class CountryController {
	@Autowired
	private CountryService service;
		
	@PostMapping("/regist.do")
	@ResponseBody // 메솓의 결과를 단순한 메시지로 넘기겠다
	public  Map<String,Object> insertCountryStatus(CountryStatus countryStatus, Model model) {
		Map<String,Object> result = new HashMap<>();
		try {
			service.insertCountryStatus(countryStatus);
			result.put("result", "1"); // 성공
		} catch (Exception e) {
			result.put("result", "0");		
			}
		return result;
	}
	
	@GetMapping("/deletes")
//	public String deleteCountryStatus(ArrayList<String> ccodes) {
	public String deleteCountryStatus(String[] ccodes) {
		
		System.out.println(ccodes.length);
		
		service.deleteCountryStatus(ccodes);
		// �궘�젣�썑 �씠�룞�븷 �럹�씠吏�
		return "redirect:list";
	}

	@ResponseBody
	@GetMapping("/list.do")
	public List<CountryStatus> selectCountryStatus() {
		return service.selectCountryStatus();
	}
	
	@GetMapping("/detail.do")
	@ResponseBody
	public CountryStatus selectCountryStatusByCcode(String ccode) {
		return service.selectCountryStatusByCcode(ccode);
	}
}






package com.ssafy.apiserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test02 {
	
	@GetMapping(value="/cors/test02", produces = "text/html;charset=utf-8")
	public String service() {
		System.out.println("요청 들어옴");
		return "<h1>Api Proxy 호출 성공</h1>";
	}
}

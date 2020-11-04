package com.ssafy.apiserver;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test04 {

//	@CrossOrigin(origins = "http://localhost:7000") // 아래의 주석을 이걸로 대신할 수 있음, 특정 오리진만
	@CrossOrigin(origins = "*") // 아래의 주석을 이걸로 대신할 수 있음, 모든 오리진
	@GetMapping(value="/cors/test04", produces = "text/html;charset=utf-8")
//	public String service(HttpServletResponse response) {
	public String service() {
		System.out.println("요청 들어옴");
//		response.setHeader("Access-Control-Allow-Origin", "http://localhost:7000");
		return "<h1>Api 헤더 변경 호출 성공</h1>";
	}
}
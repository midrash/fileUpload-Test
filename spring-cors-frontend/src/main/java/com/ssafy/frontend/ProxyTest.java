package com.ssafy.frontend;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProxyTest {
	
	@GetMapping(value = "/cors/proxytest", produces = "text/html;charset=utf-8")
	public String service() throws Exception {
		// Api 서버 주소 : http://localhost:8080/apiserver/cors/test01
		URL url = new URL("http://localhost:8080/apiserver/cors/test02");
		InputStream in = url.openStream();
		Scanner sc = new Scanner(in);
		StringBuffer sb = new StringBuffer();
		while (sc.hasNextLine()) {
			sb.append(sc.nextLine());
		}
		return sb.toString();
	}
}

package fileupload;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fileupload/test01.do")
public class Test01 extends HttpServlet {
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/plain; charset=utf-8"); 
		
		PrintWriter out = response.getWriter();
//		String msg = request.getParameter("msg");
//		out.println("msg : " + msg);
		//*
		// 사용자가 전송한 내용을 직접 확인하자
		InputStream in = request.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in, "utf-8"));
		while (true) {
			String line = br.readLine();
			if (line == null) {
				break;
			}
			// 사용자의 요청 정보를 브라우져로 전송한다.
			out.println(line);
		}
		
		br.close();
		//*/
		
		
		
		out.close();
	}
}





















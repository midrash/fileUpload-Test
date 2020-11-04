/**
 * 오픈 소스를 이용한 파일 업로드 작성하기
 * 
 * apache commons 라이브러리 사용
 * 
 * mvnrepository.com 사이트 접속 후
 * - commons-fileupload
 * - commons-io
 */
package fileupload;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/fileupload/test02.do")
public class Test02 extends HttpServlet {
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 파일 업로드 시 디스크나 메모리를 이용해서 FileItem 객체 생성처리
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setSizeThreshold(1024);  // 메모리 사용 버퍼 바이트 설정
		// factory.setRepository(new File("c:/SSAFY/temp"));
		
		// 파일 업로드 요청 처리 
		ServletFileUpload upload = new ServletFileUpload(factory);
		try {
			// 사용자 request로부터 보내온 내용을 파싱하여 결과를 반환한다.
			List<FileItem> lists = upload.parseRequest(request);
			for (FileItem item :lists) {
				
				// file save 작업 진행
				if (item.isFormField() == false) {
					// 파일 정보 추출하기
					// 사용자가 업로드한 파일 이름
					String name = item.getName();
					// 사용자가 업로드한 파일 크기
					long size = item.getSize();
					// 사용자가 업로드한 파일의 타입
					String contentType = item.getContentType();
					
					System.out.println("폼필드이름 : " + item.getFieldName());
					System.out.println("파일명 : " + name);
					System.out.println("크기 : " + size);
					System.out.println("파일타입 : " + contentType);
					
					// 업로드한 정보를 서버 컴에 저장하기
					// 저장할 서버의 위치 지정
					item.write(new File("C:\\SSAFY\\upload", name));
					continue;
				}
//				System.out.println(item.isFormField());
				System.out.println(item.getFieldName());
				System.out.println(item.getString("utf-8"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}





















/**
 * 썸네일 생성과 고유이름 으로 저장하기
 * 1. 고유이름 - UUID
 * 2. 썸네일 만들기
 *    - thumbnailator
 * 
 * mvnrepository.com 사이트 접속 후
 * - thumbnailator
 */
package fileupload;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import net.coobird.thumbnailator.Thumbnails;

@WebServlet("/fileupload/test03.do")
public class Test03 extends HttpServlet {
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setSizeThreshold(1024);  // 메모리 사용 버퍼 바이트 설정
		
		// 파일 업로드 요청 처리 
		ServletFileUpload upload = new ServletFileUpload(factory);
		try {
			List<FileItem> lists = upload.parseRequest(request);
			for (FileItem item :lists) {
				
				if (item.isFormField() == false) {
					// 유니크한 이름 만들기
					String name = UUID.randomUUID().toString();
					File f = new File("C:\\SSAFY\\upload", name);
					item.write(f);
					
					// 썸네일 생성하기
					if (item.getContentType().startsWith("image/")) {
						Thumbnails.of(f)  // f 파일을 기반으로 해서 만든다.
						          .size(400, 200)  // 썸네일 이미지 크기
						          .toFile(new File(f.getParent(), "thumb_" + name));
					}
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





















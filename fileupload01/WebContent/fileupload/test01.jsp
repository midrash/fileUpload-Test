<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
	http://localhost:8080/fileupload01/fileupload/test01.jsp
	http://localhost:8080/fileupload01/fileupload/test01.do
	
	form tag : 
	enctype의 디폴터 application/x-www-form-urlencoded는 사용자의 입력값을 name=value&name=value...으로 만들어서 보낸다.
	파일 업로드시 enctype은 "multipart/form-data" 로 설정한다.
	           method 방식은 post를 사용한다.
	 -->
	<form action="test01.do" method="post" 
	      enctype="multipart/form-data">
		<input type="text" name="msg">
		<input type="file" name="attach">
		<button>전송</button>
	</form>
</body>
</html>
















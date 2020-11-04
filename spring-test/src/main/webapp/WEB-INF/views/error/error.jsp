<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp"%>
	<h2>처리중 문제가 발생하였습니다.</h2>
	<h3>문제내용 - ${errorMsg}</h3>
</body>
</html>
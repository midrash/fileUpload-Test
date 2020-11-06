<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>        
<!DOCTYPE html>
<html>
	<head>
		<title>게시글 상세</title>
	</head>
	<body>
		<h2>게시판</h2>
		<div>
			<label>번호</label>
			<span>${board.no}</span>
		</div>
		<div>
			<label>제목</label>
			<span>${board.title}</span>
		</div>
		<div>
			<label>첨부파일</label>
			<span>
				<c:forEach var="file" items="${board.fileList}">
					${file.orgName}(${file.fileSize} byte)<br>
				</c:forEach>
			</span>
		</div>
		
		<a href='list'>목록</a>
	</body>
</html>











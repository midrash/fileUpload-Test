<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp"%>
	<form action="deletes">
		<table>
			<tr>
				<th>국가번호</th>
				<th>국가명</th>
				<th>확진자수</th>
				<th>지역</th>
				<th>삭제</th>
			</tr>
			<c:forEach var="cs" items="${list}">
				<tr>
					<td><a href="detail?ccode=${cs.ccode}">${cs.ccode}</a></td>
					<td>${cs.cname}</td>
					<td>${cs.patient}</td>
					<td>${cs.rname}</td>
					<td><input type="checkbox" name="ccodes" value="${cs.ccode}"></td>
				</tr>
			</c:forEach>
		</table>
		<div>
			<button>선택항목삭제</button>
		</div>
	</form>
	<%@ include file="/WEB-INF/views/include/footer.jsp"%>
</body>
</html>
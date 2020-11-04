<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>SSAFY</title>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp"%>
	<h2>확진자 현황 등록</h2>
		<label for="ccode" class="inputtitle">국가 번호</label>
		<input type="text" value="${countryStatus.ccode}">
		<br>
		<label for="cname" class="inputtitle">국가명</label>
		<input type="text" value="${countryStatus.cname}">
		<br>
		<label for="patient" class="inputtitle">확진자수</label>
		<input type="text" value="${countryStatus.patient}">
		<br>
		<label for="rcode" class="inputtitle">지역</label>
		<input type="text" value="${countryStatus.rname}">
	
	<%@ include file="/WEB-INF/views/include/footer.jsp"%>
</body>

</html>
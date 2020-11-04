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
	<c:if test="${!empty loginUser }">
		<h2>이미 로그인 되었습니다.</h2>		
	</c:if>
	<c:if test="${empty loginUser }">
		<form action="${pageContext.request.contextPath}/user/login" method="post">
			<div>
				<label>아이디</label>
				<input type="text" name="id">
			</div>
			<div>
				<label>패스워드</label>
				<input type="password" name="pw">
			</div>
			<div>
				<button>로그인</button>
			</div>
		</form>
	</c:if>
	<%@ include file="/WEB-INF/views/include/footer.jsp"%>
</body>
</html>
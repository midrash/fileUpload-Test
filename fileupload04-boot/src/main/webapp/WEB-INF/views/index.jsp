<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>스프링 레거시 - 파일업로드1</h2>
	<form method="post" enctype="multipart/form-data" action="${pageContext.request.contextPath}/file/upload1.do"> <!-- dy일땐 직접 서블릿을 불러서 했었는데 스프링은 이렇게 하면 컨테이너가 관리하지 않아서 빈을 사용하지 못햄 그래서 이렇게 해서 켄테이너를 이용해야함 -->>
	<input type="text" name="msg" value="test"><br>
	<input type="file" name="attach"><br>
	<button>업로드</button> 
	
	</form>
	<h2>스프링 레거시 - 파일업로드2</h2>
	<form method="post" enctype="multipart/form-data" action="${pageContext.request.contextPath}/file/upload2.do"> <!-- dy일땐 직접 서블릿을 불러서 했었는데 스프링은 이렇게 하면 컨테이너가 관리하지 않아서 빈을 사용하지 못햄 그래서 이렇게 해서 켄테이너를 이용해야함 -->>
	<input type="text" name="msg" value="test"><br>
	<input type="file" name="attach" multiple="multiple"><br>
	<button>업로드</button> 
	</form>
	
	<h2>스프링 레거시 - 파일업로드3</h2>
	<form method="post" enctype="multipart/form-data" action="${pageContext.request.contextPath}/file/upload3.do"> <!-- dy일땐 직접 서블릿을 불러서 했었는데 스프링은 이렇게 하면 컨테이너가 관리하지 않아서 빈을 사용하지 못햄 그래서 이렇게 해서 켄테이너를 이용해야함 -->>
	<input type="text" name="msg" value="test"><br>
	<input type="file" name="attach" multiple="multiple"><br>
	<button>업로드</button> 
	</form>
</body>
</html>
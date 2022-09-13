<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" enctype="multipart/form-data"> <%-- 일반적인 데이터가 아닌 이진데이터라 multipart를 써줘야함 --%>
		<input type="file" name="upload"/>
		<input type="submit"/>
	</form>
</body>
</html>
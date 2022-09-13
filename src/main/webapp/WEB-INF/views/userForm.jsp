<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<f:form modelAttribute="user" method="post">
		<f:errors path="name"/> <%-- 이름에 대한 에러를 출력 --%>
		<f:input type="text" path="name"/>
		<f:errors path="age"/> <%-- 나이에 대한 에러를 출력 --%>
		<f:input type="number" path="age"/>
		<input type="submit"/>
	</f:form>
</body>
</html>
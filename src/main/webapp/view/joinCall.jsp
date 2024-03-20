<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
이름 : <%= request.getAttribute("name") %> <br>
아이디 : <%= request.getAttribute("id") %><br>
나이 : <%= request.getAttribute("age") %> <br>
생일 : <%= request.getAttribute("birthday") %> <br>
비밀번호 : <%= request.getAttribute("password") %><br>
성별 : <%= request.getAttribute("gender") %><br>
취미 : <%= request.getAttribute("hobby") %><br>
</body>
</html>
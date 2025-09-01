<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보</title>
</head>
<body>
	<h2>tiger님의 회원정보</h2>
	<hr>
	<b>아이디 / 이름 / 주소 / 전화번호</b><br>
	${userinfo.userid } / ${userinfo.username } / ${userinfo.useraddress } / ${userinfo.userphone }
</body>
</html>
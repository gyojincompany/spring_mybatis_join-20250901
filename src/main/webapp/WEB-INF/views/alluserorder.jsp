<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>모든 유저의 주문 리스트</title>
</head>
<body>
	<h2>모든 유저의 주문 리스트</h2>
	<hr>
	<c:forEach items="${allUserOrders }" var="userDto">
		<h3>고객아이디 : ${userDto.userid }</h3>
		<h3>고객이름 : ${userDto.username }</h3>
		<table border="1">
			<tr>
				<th>주문번호</th>
				<th>주문제품이름</th>
			</tr>
			<c:forEach items="${userDto.orderDtos }" var="order">
			<tr>
				<td>${order.orderid }</td>
				<td>${order.ordername }</td>
			</tr>
			</c:forEach>
		</table>
		<hr>
	</c:forEach>
</body>
</html>
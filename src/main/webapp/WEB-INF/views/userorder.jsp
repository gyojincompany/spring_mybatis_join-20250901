<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>유저의 주문리스트</title>
</head>
<body>
	<h2>${userOrder.userid }님의 주문 리스트</h2>
	<hr>	
	<h2>고객 : ${userOrder.username }</h2>
		<b>주문번호 / 주문이름</b><br>
		<c:forEach items="${userOrder.orderDtos}" var="order">
			${order.orderid } / ${order.ordername } <br>
		</c:forEach>
</body>
</html>
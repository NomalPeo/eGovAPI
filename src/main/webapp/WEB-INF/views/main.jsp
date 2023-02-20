<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	<table border="1" style="margin:200px auto auto auto; border-collapse: collapse; width:300px; text-align: center;">
		<tr>	
			<td><span>강수형태</span></td>
			<td><c:out value="${list1[0].category }"/></td>
			<td><c:out value="${list1[0].obsrValue }"/></td>
		<tr>
		<tr>	
			<td><span>습도</span></td>
			<td><c:out value="${list1[1].category }"/></td>
			<td><c:out value="${list1[1].obsrValue }"/></td>
		<tr>
		<tr>	
			<td><span>1시간 강수량</span></td>
			<td><c:out value="${list1[2].category }"/></td>
			<td><c:out value="${list1[2].obsrValue }"/></td>
		<tr>
		<tr>	
			<td><span>기온</span></td>
			<td><c:out value="${list1[3].category }"/></td>
			<td><c:out value="${list1[3].obsrValue }"/></td>
		<tr>
		<tr>	
			<td><span>동서바람성분</span></td>
			<td><c:out value="${list1[4].category }"/></td>
			<td><c:out value="${list1[4].obsrValue }"/></td>
		<tr>
		<tr>	
			<td><span>풍량</span></td>
			<td><c:out value="${list1[5].category }"/></td>
			<td><c:out value="${list1[5].obsrValue }"/></td>
		<tr>
		<tr>	
			<td><span>남북 바람성분</span></td>
			<td><c:out value="${list1[6].category }"/></td>
			<td><c:out value="${list1[6].obsrValue }"/></td>
		<tr>
		<tr>	
			<td><span>풍속</span></td>
			<td><c:out value="${list1[7].category }"/></td>
			<td><c:out value="${list1[7].obsrValue }"/></td>
		<tr>
	
	</table>
</body>
</html>
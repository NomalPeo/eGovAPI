<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<body>
<div margin="200px auto 0 auto">
	<div>지역 선택</div>
	<form action="/main.do" method="post">
		<select name="area">
    <option value="61125">서울</option>
    <option value="93132">강릉</option>
    <option value="9977">해운대</option>
</select>
<input type="submit" value="확인">
	</form>
</div>
</body>
</html>
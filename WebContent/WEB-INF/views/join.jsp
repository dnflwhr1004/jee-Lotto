<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로또프로그램</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<h1>회원가입</h1>
<form id = "consumer" action="<%=request.getContextPath()%>/consumer.do">
	ID : <input type="text"  name = "cid" /> </br>
	PW : <input type="password"  name = "pass"/>
	<input type="submit"  value = "전송"/>
</form>
</body>
<script>
$('#consumer').submit(function() {
	alert('제이쿼리 테스트');
});
</script>
</html>
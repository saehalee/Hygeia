<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>설문조사-시작페이지</title>
<script src="/jquery-3.6.0.min.js"></script>
</head>

<body>

    <!-- 제목  --> 
    <section>
      <h3>성인병 증상 간단 테스트</h3>
    </section>

	<!-- a태그 예시 : naver 
	
	<a href="http://www.naver.com">Go Naver</a><br>
	
	  -->
    
    <!-- 시작 버튼 -->
	<br>
	<br>
	<br>
	<br>
	<form method="POST" action="/survey1">
	<input type="hidden" name="no" value="1" />
	<input type="submit" name="startbtn" value=">     테스트 시작하기" />
	</form> 
	
	<br>
	<input type="button" value="홈페이지로 이동하기" name="backtoindex" onClick="location.href='http://localhost:8081/index'" />
	<br>
	<br> 
	
	<!-- footer -->
	<br>
	<br>
	<br>
	<br>

    
    
</body>

</html>

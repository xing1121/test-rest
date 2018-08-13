<%@page import="com.sf.rest.domain.Person"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Hello Web!!</title>
		<!-- 引入jquery -->
		<script type="text/javascript" src="${ctp }/script/jquery-3.2.1.min.js"></script>
		<script type="text/javascript">
			$(function(){
				
				$("#btn_01").click(function(){
					
					$.ajax({
						url:"${ctp}/persons",
						type : "get",
						success : function(res){
							
							for (var i = 0; i < res.length; i++) {
								alert(JSON.stringify(res[i]));
							}
							
						}
					});
					
				});
				
				
			});
		</script>
	</head>
	<body>
		<a href="${ctp }/hello">hello</a>
		<br>
		<button id="btn_01">点我</button>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculator</title>
</head>
<body>
	<form action="CalServlet" method="post">
		操作数1：<input type="text" name="num1" value="${requestScope.calculator.num1 }"/><br>
		<!--利用三目运算符来代替选择语句，EL语句定位运算符。  -->
		运算符：<input type="radio" name="op" value="+" ${requestScope.calculator.op=="+"?"checked":""}/>+
		     <input type="radio" name="op" value="-" ${requestScope.calculator.op=="-"?"checked":""}/>-
			 <input type="radio" name="op" value="*" ${requestScope.calculator.op=="*"?"checked":""}/>*
			 <input type="radio" name="op" value="/" ${requestScope.calculator.op=="/"?"checked":""}/>/<br>
		操作数2：<input type="text" name="num2" value="${requestScope.calculator.num2 }"/><br>
		<input type="submit" value="计算"/><br>
		<!--${requestScope.result}相当于request.getParameter("result")  -->
		结果：<input type="text" name="result" value="${requestScope.result}"/> 
		
	</form>
</body>
</html>
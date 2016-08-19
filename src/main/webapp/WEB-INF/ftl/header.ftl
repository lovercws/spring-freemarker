<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>Insert title here</title>  
</head>  
<body>  
<#list users as user>
	username : ${user.username?upper_case}<br/>
    password : ${user.password?upper_case}<br/>
</#list>
</body>  
</html>
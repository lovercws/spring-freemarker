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

<#if 1=1>
	hello world
</#if>

<h1>Welcome ${user!"visit"}!</h1>

(23+12)/2计算结果 ${(23+12)/2}<br/>

<#assign names=['cws','lgan']>
<#list names as name>
name is ${name}<br/>
</#list>
</body>  
</html>
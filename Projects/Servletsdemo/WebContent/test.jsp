<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Testing JSPs</h3>
<%!
public int add(int a, int b){
	return(a+b);
}
%>
<%
out.println("Hey ");
out.println("Hello");
int i =2;
int j =1;
int k = add(5,4);
%>
<br>
the value of k is:<%=k %>
<%
for(int l=0;l<5;l++){
%>
<br>value i=<%=l %>
<%} %>
<br>
hey
time is<%=new Date() %>
</body>
</html>
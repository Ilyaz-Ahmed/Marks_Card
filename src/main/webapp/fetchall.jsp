<%@page import="Markscarddto.Marksdto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%List<Marksdto> d=(List<Marksdto>) request.getAttribute("list");%>

<%for(Marksdto a: d){%>
<table border="">
<tr>
<th><%=a.getUSN()%></th>
<th><%=a.getSName()%></th>
<th><%=a.getMName()%></th>
<th><%=a.getFName()%></th>

<th><%=a.getI_English()%></th>
<th><%=a.getI_Hindi()%></th>
<th><%=a.getI_Kannada()%></th>
<th><%=a.getI_Maths()%></th>
<th><%=a.getI_Science()%></th>
<th><%=a.getI_Social()%></th>
<th><%=a.getE_English()%></th>
<th><%=a.getE_Hindi()%></th>
<th><%=a.getE_Kannada()%></th>
<th><%=a.getE_Mathematics()%></th>
<th><%=a.getE_Science()%></th>
<th><%=a.getE_Social()%></th>
<th><%=a.getI_English()+a.getE_English()%></th>
<th><%=a.getI_Hindi()+a.getE_Hindi()%></th>
<th><%=a.getI_Kannada()+a.getE_Kannada()%></th>
<th><%=a.getI_Maths()+a.getE_Mathematics()%></th>
<th><%=a.getI_Science()+a.getE_Science()%></th>
<th><%=a.getI_Social()+a.getE_Social()%></th>
<th><%=a.getPercentage()%></th>


</tr>


</table>


<%}%>
</body>
</html>
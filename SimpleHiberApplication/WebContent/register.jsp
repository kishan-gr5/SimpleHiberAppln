<%@page import="com.kishan.webapp.UserDAO"%>
<jsp:useBean id="obj" class="com.kishan.webapp.User"></jsp:useBean>
<jsp:setProperty property="*" name="obj"/>

<%
	int i = UserDAO.register(obj);
	if(i>0)
	out.print("you are successfully registered");
	
%>
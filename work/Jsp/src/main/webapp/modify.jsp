<%@page import="com.study.jsp.MemberDto"%>
<%@page import="com.study.jsp.MemberDao"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>    
    
<%
	String id = (String)session.getAttribute("id");
	MemberDao dao = MemberDao.getInstance();
	MemberDto dto = dao.getMember(id);
%>   
   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP/Servlet 21-1</title>
<script language="JavaScript" src="member.js"></script>
</head>
<body>
	<form action="modifyOk.jsp" method="post" name="reg_frm">
		아이디 : <%= dto.getId() %><br>
		비밀번호 : <input type="password" name="pw" size="20"><br>
		비밀번호 확인 : <input type="password" name="pw_check" size="20"><br>
		이름 : <%= dto.getName() %><br>
		메일 : <input type="text" name="eMail" size="20" value="<%=dto.geteMail() %>"><br>		
		주소 : <input type="text" name="address" size="50" value="<%=dto.getAddress() %>"><br><p>
		
		<input type="button" name="수정" onclick="updateInfoConfirm()">&nbsp;&nbsp;&nbsp;
		<input type="reset" name="취소" onclick="javascript:window.location='main.jsp'">
	</form>
	

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AutenticacaoServlet"  method="post">
	<label for="user">Nome</label>
	<input name="user" type="text" style="display: block"/>
	<label for="password">senha</label>				
	<input name="password" type="password" style="display: block"/>
	<label for="conectado">Manter Conectado</label>
	<input name="salvarSenha" type="checkbox" style="display: block"/> 
	<input type="submit" id="submit" value="Logar"/>
</form>

</body>
</html>
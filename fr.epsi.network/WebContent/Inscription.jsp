<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Inscription</title>
	</head>
	<body>
		<p>Bienvenue</p>
		<form action="Connection.jsp" method="get">
			<fieldset>
				<legend>Inscription au Centre de Messagerie</legend>
				Nom d'utilisateur (e-mail) : <br/>
				<input type="text"><br/>
				Mot de passe : <br/>
				<input type="password"><br/>
				Confirmation du Mot de passe : <br/>
				<input type="password"><br/>
				<input type="radio"> Etes-vous admin?<br/>
				<input type="submit" value="S'inscrir"><br/>
			</fieldset>
		</form>
	</body>
</html>
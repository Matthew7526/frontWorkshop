<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Connection</title>
	</head>
	<body>
		<p>Bienvenue</p>
		<form action="Accueil.jsp" method="post">
			<fieldset>
				<legend>Connection au Centre de Messagerie</legend>
				Nom d'utilisateur (e-mail) : <br/>
				<input type="text"><br/>
				Mot de passe : <br/>
				<input type="password"><br/>
				<input type="submit" value="Se connecter"><br/>
			</fieldset>
		</form>
		<a href="Inscription.jsp">Je ne suis pas encore enregistrer</a><br/>
		<a>Mot de passe oublier?</a>
	</body>
</html>
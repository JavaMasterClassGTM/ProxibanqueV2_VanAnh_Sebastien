<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css\monstyle.css">


<title>Nouveau client</title>
<style type="text/css">
body {
	width: 50%;
	margin: 0 auto;
}
</style>
</head>
<body>
<form action="ServletCreationClient" method="post">
		<fieldset>
			<legend>Nouveau client</legend>
			
			Adresse : <input type="text" name="adresse" placeholder="Adresse" />
			<p />
			Code Postal : <input type="text" name="codePostal" placeholder="ex: 78000" />
			<p />
			Ville : <input type="text" name="ville" placeholder="ex: Versailles" />
			<p />
			Téléphone : <input type="text" name="telephone" placeholder="ex: 01000000" />
			<p />
			E-mail : <input type="text" name="eMail" placeholder="ex: toto@proxybanque.com" />
			<p />
			<button type="submit">Valider</button>
			
		
		</fieldset>
	</form>
	<a href="/WEB-INF/ListeClients.jsp">Retour à la liste clients</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fiche client</title>
<style type="text/css">
body {
	text-align: center;
	width: 50%;
	margin: 0 auto;
}
</style>
</head>
<body>
<fieldset>
${client.nom}
<br /> ${client.prenom}
<br /> ${client.adresse}
<br /> ${client.codePostal}
<br /> ${client.ville}
<br />${client.telephone}
<br />${client.eMail}

<form action="ServletEditerClient" method="get">
		
			<legend>Editer client</legend>
			
			<input type="text" name="adresse" placeholder="Adresse" />
			<p />
			 <input type="text" name="codePostal" placeholder="ex: 78000" />
			<p />
			 <input type="text" name="ville" placeholder="ex: Versailles" />
			<p />
			 <input type="text" name="telephone" placeholder="ex: 01000000" />
			<p />
			<input type="text" name="eMail" placeholder="ex: toto@proxybanque.com" />
			<p />
			<button type="submit">Valider</button>
			
		
		
	</form>
</fieldset>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css\monstyle.css">
<title>Liste Clients</title>

<style type="text/css">
body {
	text-align: center;
	width: 50%;
	margin: 0 auto;
}
</style>
</head>
<body>
	<form action="ServletCreationClient" method="get">
		<button type="submit">Ajouter client</button>
	</form>
	<p />
	<h3>Liste clients</h3>
	<p />
	

	<c:forEach var="client" items="${liste}">
		<td>${client.nom} ${client.prenom}	
		    <a href="<c:url value="/ServletAfficherCLient"> 
                <c:param name="id" value="${client.id}"/>
   				 </c:url>">Editer Client</a>  
			
			<a href="<c:url value="/ServletAfficherCompte"> 
                <c:param name="id" value="${client.id}"/>
   				 </c:url>">Voir comptes</a>  
			
			<a>Virement</a>
		</td>
		<br>
	</c:forEach>


</body>
</html>
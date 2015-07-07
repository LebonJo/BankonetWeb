<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="includes/includeTagLibs.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Virement effectué</title>
</head>
<body>
	<h1>Votre virement a été correctement effectué</h1>
	
	<table>
		<tr>
			<th style="border:1px solid black"></th>
			<th style="border:1px solid black">Libellé</th>
			<th style="border:1px solid black">Solde</th>
		</tr>
		<tr>
			<th style="border:1px solid black">Compte source</th>
			<td style="border:1px solid black"><c:out value="${virement.compteSource.libelle}"/></td>
			<td style="border:1px solid black"><c:out value="${virement.compteSource.solde}"/></td>
		</tr>
		<tr>
			<th style="border:1px solid black">Compte destination</th>
			<td style="border:1px solid black"><c:out value="${virement.compteDestination.libelle}"/></td>
			<td style="border:1px solid black"><c:out value="${virement.compteDestination.solde}"/></td>
		</tr>
	</table>
	
	<a href="<c:url value="/jsp/pagePrincipale.jsp"/>">Page principale</a>
</body>
</html>
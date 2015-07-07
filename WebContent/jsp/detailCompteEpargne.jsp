<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="includes/includeTagLibs.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Détail compte</title>
</head>
<body>
	<h1>Détail du compte épargne</h1>
	
	<table>
		<tr>
			<th style="border:1px solid black">Identifiant</th>
			<td style="border:1px solid black">${compteEpargne.identifiant}</td>
		</tr>
		<tr>
			<th style="border:1px solid black">Libellé</th>
			<td style="border:1px solid black">${compteEpargne.libelle}</td>
		</tr>
		<tr>
			<th style="border:1px solid black">Solde</th>
			<td style="border:1px solid black">${compteEpargne.solde}</td>
		</tr>
		<tr>
			<th style="border:1px solid black">Taux d'intérêt</th>
			<td style="border:1px solid black">${compteEpargne.tauxInteret}</td>
		</tr>
		<tr>
			<th style="border:1px solid black">Plafond</th>
			<td style="border:1px solid black">${compteEpargne.plafond}</td>
		</tr>
	</table>
	<a href="<c:url value="/jsp/pagePrincipale.jsp"/>">Page principale</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="includes/includeTagLibs.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>D�tail compte courant</title>
</head>
<body>
	<h1>D�tail compte courant</h1>
	
	<table>
		<tr>
			<th style="border:1px solid black">Identifiant</th>
			<td style="border:1px solid black">${compteCourant.identifiant}</td>
		</tr>
		<tr>
			<th style="border:1px solid black">Libell�</th>
			<td style="border:1px solid black">${compteCourant.libelle}</td>
		</tr>
		<tr>
			<th style="border:1px solid black">Solde</th>
			<td style="border:1px solid black">${compteCourant.solde}</td>
		</tr>
		<tr>
			<th style="border:1px solid black">D�couvert autoris�</th>
			<td style="border:1px solid black">${compteCourant.decouvertAutorise}</td>
		</tr>
	</table>
	<a href="<c:url value="/jsp/pagePrincipale.jsp"/>">Page principale</a>
</body>
</html>
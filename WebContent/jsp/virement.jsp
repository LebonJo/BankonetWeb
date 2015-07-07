<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="includes/includeTagLibs.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Virement</title>
</head>
<body>
	<h1>Virement</h1>
	
	<form action="<c:url value="/traiterVirement"/>" method="POST">
		<table>
			<tr>
				<th>Compte source</th>
				<th>Compte destinataire</th>
				<th>Montant à virer</th>
			</tr>
			<tr>
				<td>
					<select name="compteSource">
						<c:forEach items="${client.comptes}" var="compte">
							<option value="${compte.identifiant}"><c:out value="${compte.libelle}"/></option>
						</c:forEach>
					</select>
				</td>
				<td>
					<select name="compteDest">
						<c:forEach items="${client.comptes}" var="compte">
							<option value="${compte.identifiant}"><c:out value="${compte.libelle}"/></option>
						</c:forEach>
					</select>
				</td>
				<td>
					<input type="number" value="" name="montant"/>
				</td>
		</table>
		
		<input type="submit" value="Virer" name="button_virer" />
		<input type="reset" value="Réinitialiser" name="button_reset" />
	</form>
	<a href="<c:url value="/jsp/pagePrincipale.jsp"/>">Page principale</a>
</body>
</html>
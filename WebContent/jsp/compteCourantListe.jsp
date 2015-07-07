<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="includes/includeTagLibs.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Comptes courants</title>
</head>
<body>
	<h1>Comptes courants</h1>
	
	<table>
		<tr>
			<th style="border:1px solid black">Intitulé</th>
			<th style="border:1px solid black">Solde</th>
			<th style="border:1px solid black">Découvert autorisé</th>
		</tr>
		<%-- nul, on utilise jstl maintenant c'est plus rigolo
		List<CompteCourant> listComptes = client.getCompteCourantList();
		Iterator compteIte = listComptes.iterator();
	    while (compteIte.hasNext()) {
            CompteCourant compte = (CompteCourant) compteIte.next();
        --%>
		<!-- tr>
			<td style="border:1px solid black"><%--=compte.getLibelle() --%></td>
			<td style="border:1px solid black"><%--=compte.getSolde() --%></td>
			<td style="border:1px solid black"><%--=compte.getDecouvertAutorise() --%>
		</tr-->		
		<%--
		}
		--%>
		<c:forEach items="${client.compteCourantList}" var="compte">
		<tr>
			<td style="border:1px solid black">
				<a href="<c:url value="/detailCompteCourant"><c:param name="id" value="${compte.identifiant}"/></c:url>">
					<c:out value="${compte.libelle}" />
				</a>
			</td>
			<td style="border:1px solid black"><c:out value="${compte.solde}" /></td> 
			<td style="border:1px solid black"><c:out value="${compte.decouvertAutorise}" /></td>
		</tr>
	</c:forEach>
	</table>
	<a href=<%=request.getContextPath() + "/jsp/pagePrincipale.jsp" %>>Page principale</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="includes/includeTagLibs.jsp" %>

<jsp:useBean id="client" scope="session" type="com.bankonet.model.Client"></jsp:useBean>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page principale</title>
</head>
<body>
	<h1>Page principale</h1>
	
	<p>Bonjour <%=client.getNom()%> <%=client.getPrenom() %></p>
	
	<p>Opérations disponibles</p>	
	<ul>
		<li><A href="<c:url value="/compteCourantListe"/>">Compte courant</A></li>
		<li <%=client.getCompteEpargneList().isEmpty() ? "style=\"display : none\"" : ""%>><A href="<c:url value="/compteEpargneListe"/>">Compte épargne</A></li>
		<li><A href="<c:url value="/initVirement"/>">Effectuer un virement</a>
		<li><A href="<c:url value="/jsp/fin.jsp"/>">Quitter</a>
	</ul>
	
</body>
</html>
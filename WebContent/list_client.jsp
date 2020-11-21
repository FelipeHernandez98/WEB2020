<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listando Clientes</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>

<h3 class="p-4">Listado de Clientes</h3>

<jsp:useBean id="cDao" class="dao.ClienteDao" scope="request" />

<table class="table">
<tr>
  
  <th style="text-align: center;">Nombre</th>
   <th style="text-align: center;">Email</th>
  <th style="text-align: center;">Clave</th>
  
  
  
</tr>

<c:forEach var ="c" items="${cDao.listar()}">

 <tr>
  
  <td style="text-align: center;"><c:out value="${c.nombre }"/></td>
  <td style="text-align: center;"><c:out value="${c.email }"/></td> 
   <td style="text-align: center;"><c:out value="${c.clave }"/></td>

</tr>

</c:forEach>
</table>
</body>
</html>
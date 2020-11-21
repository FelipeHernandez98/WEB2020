<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listando Tiendas</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>

<h3 class="p-4">Listado de Tiendas</h3>

<jsp:useBean id="tDao" class="dao.TiendaDao" scope="request" />

<table class="table">
<tr>
  
  <th style="text-align: center;">Nombre</th>
  <th style="text-align: center;">Descripcion</th>
  <th style="text-align: center;">Lema</th>
   <th style="text-align: center;">Email</th>
  <th style="text-align: center;">Clave</th>
  <th style="text-align: center;">Propietario</th>
   <th style="text-align: center;">Facebook</th>
  <th style="text-align: center;">Web</th>
  <th style="text-align: center;">Imagen</th>
  
  
</tr>

<c:forEach var ="t" items="${tDao.listar()}">

 <tr>
  
  <td style="text-align: center;"><c:out value="${t.nombre }"/></td>
  <td style="text-align: center;"><c:out value="${t.descripcion }"/></td> 
   <td style="text-align: center;"><c:out value="${t.lema }"/></td>
  <td style="text-align: center;"><c:out value="${t.email }"/></td> 
   <td style="text-align: center;"><c:out value="${t.clave }"/></td>
  <td style="text-align: center;"><c:out value="${t.propietario }"/></td> 
   <td style="text-align: center;"><c:out value="${t.facebook }"/></td>
  <td style="text-align: center;"><c:out value="${t.web }"/></td> 
    <td style="text-align: center;"><c:out value="${t.imagen }"/></td>
</tr>

</c:forEach>
</table>
</body>
</html>
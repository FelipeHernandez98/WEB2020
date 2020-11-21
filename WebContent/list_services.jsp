<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listando Servicios</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>

<h3 class="p-4">Listado de Servicios</h3>

<jsp:useBean id="sDao" class="dao.ServiciosDao" scope="request" />

<table class="table">
<tr>
  
  <th style="text-align: center;">Nombre</th>
   <th style="text-align: center;">Descripcion</th>
  <th style="text-align: center;">Tienda</th>
  
  
  
</tr>

<c:forEach var ="s" items="${sDao.listar()}">

 <tr>
  
  <td style="text-align: center;"><c:out value="${s.nombre }"/></td>
  <td style="text-align: center;"><c:out value="${s.descripcion }"/></td> 
   <td style="text-align: center;"><c:out value="${s.tienda }"/></td>

</tr>

</c:forEach>
</table>
</body>
</html>
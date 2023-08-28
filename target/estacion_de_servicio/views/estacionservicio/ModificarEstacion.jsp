<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h3><a href="estacionservicio?accion=volvermenu"> VOLVER A MENU </a></h3>
    <table class="table table-hover table-bordered">
        <tr>
            <th>Id</th>
            <th>Nombre Estacion</th>
            <th>Direccion Estacion</th>
            <th>
                <center>Estado</center>
            </th>
        </tr>
      <c:forEach var="estacion" items="${estaciones}">   
           <form action="estacionservicio" method="post">
             <tr>
                <td><input type="number"class="form-control"name="idEstacion" value="${estacion.getIdEstacion()}" hidden/>${estacion.getIdEstacion()}</td>
                <td><input type="text"class="form-control"name="nombreEstacion" value="${estacion.getNombreEstacion()}"/></td>
                <td><input type="text"class="form-control"name="direccionEstacion"placeholder="Ingrese el nombre " value="${estacion.getDireccionEstacion()}"/></td>                
                <td><input class="form-check-input"type="checkbox"name="estadoEstacion" id="estadoEstacion"value="${estacion.getEstadoEstacion()}"/></td>
                <td><button type="submit" name="accion"value="modificarEstacion">MODIFICAR</button></td> 
             </form>
    
          </c:forEach>


    </table>











</body>
</html>
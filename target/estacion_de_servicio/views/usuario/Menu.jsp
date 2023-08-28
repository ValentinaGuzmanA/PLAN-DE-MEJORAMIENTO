<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
   <H3><a href="usuario?accion=salir"> SALIR </a> </H3> 
<center>
    <table> 
        <tr >
            <th colspan="3"> TU ESTACION ;) </th>
        </tr>
   <tr>
    <td> <a href="estacionservicio?accion=abrirformEstacion"> REGISTRAR ESTACION </a></td>  
    <td>    </td>
    <td><a href="terpel?accion=formtanquearEstacion" >TANQUEAR</a></td>
   </tr>
    <tr>
       <td>   </td>  
    </tr>

   <tr>
<td> <a href="estacionservicio?accion=abrirformmodificarEstacion"> CAMBIAR ESTACION  </a> </td>
<td>   </td>
<td>  <a href="terpel?accion=formrecargarEstacion">RECARGAR </a>  </td>
   </tr>

    </table>
</center>

  



</body>
</html>  
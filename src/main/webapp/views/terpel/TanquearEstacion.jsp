<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h3><a href="terpel?accion=volvermenu"> VOLVER A MENU </a></h3>
    <H1>TERPEL S.A</H1>
    <h2> TANQUEAR ESTACION</h2>
    <form action="terpel" method="post">
        <label for="idEstacion_Terpel">DIGITA EL ID DE LA ESTACION</label>
        <input type="text" name="idEstacion_Terpel">
        <label for="cantGalones"> DIGITA LA CANTIDAD DE GALONES QUE VAS A TANQUEAR</label>
        <input type="number"  name="cantGalones"> 
        <button name="accion" value="tanquearEstacion" type="submit"> TANQUEAR  </button>
     </form>
</body>
</html>
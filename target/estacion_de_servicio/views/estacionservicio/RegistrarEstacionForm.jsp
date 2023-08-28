<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body> 
    <h3><a href="estacionservicio?accion=volvermenu"> VOLVER A MENU </a></h3>
    <center>
    <form action="estacionservicio" method="post">
         <label for="idEstacion">  ID </label><br>
        <input type="text" name="idEstacion" id="idEstacion"  placeholder="Ingresa el id de la estacion"> <br>
        <label for="nombreEstacion"> NOMBRE ESTACION </label> <br>
        <input type="text" name="nombreEstacion" id="nombreEstacion" placeholder="Ingresa el nombre de la estacion"><br>
         <label for="direccionEstacion"> DIRECCION  </label> <br>
         <input type="text" name="direccionEstacion" placeholder="Ingresa la direccion de la estacion"><br>
         <label for="estadoEstacion"> ESTADO  </label> 
         <input type="checkbox" name="estadoEstacion" id="estadoEstacion"> 
         <button name="accion" value="registrarEstacion"  type="submit">REGISTRAR</button>
        </form>
      </center>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

<form action="usuario" method="post"> 
    <center>
<ul>
   
    <li>
    <label for="idUsuario">ID </label>
    <input type="text" id="idUsuario" name="idUsuario" placeholder="Digita tu id" required>
</li>

<li>
<label for="nombreUsuario">NOMBRE </label>
    <input type="text" id="nombreUsuario" name="nombreUsuario" placeholder="Digita tu nombre" required>
</li>

<li>
    <label for="correoUsuario">CORREO</label>
    <input type="email" id="correoUsuario" name="correoUsuario" placeholder="Digita tu email" required>
</li>
<li>
    <label for="telefono">TELEFONO</label>
    <input type="text" id="telefono" name="telefono" placeholder="Digita tu telefono" required>
</li>
<li>
    <label for="usuario">USER</label>
    <input type="text" id="usuario" name="usuario" placeholder="Digita tu usuario" required>
</li>
<li>
    <label for="password">CONTRASENA</label>
     <input type="password" id="password" name="password" placeholder="Digita tu contraseña" required>
</li>
<li>
     <label for="estado">ESTADO</label>
     <input type="checkbox" id="estado"  name="estado" required>
</li>
<li>
     <button type="submit" name="accion" value="registrarUsuario">REGISTRAR</button>
</li>
</ul></center>
</form>
</center>
    
</body>
</html>
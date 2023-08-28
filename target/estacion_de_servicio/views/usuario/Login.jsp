<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body> 




 <center>
    <% if (request.getAttribute("mensaje") != null) { %>
        <h1 color="red">
            <%= request.getAttribute("mensaje") %>
        </h1>
    <% } %>
   
    <h1><strong>INICIO SESION</strong> Estacion servicio</h1>
    <form action="usuario" method="post">
    <label for="usuario">USUARIO</label>
    <input type="text" name="usuario" id="usuario"  placeholder="Digita tu usuario"> <br>
    <label for="password">Constrasena</label>
    <input type="password" name="password"  id="password" placeholder="digita tu contraseña"> <br> 
    <button  name="accion" value="iniciarsesion" type="submit">INGRESAR</button>
</form>
   </center> 
    
</body>
</html>
package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UsuarioDao;
import model.UsuarioVo;

public class Usuario extends HttpServlet{
    // se crea el objeto usuario para el envio de datos hacia el modelo 
    // mediante sus atributos 
  UsuarioVo usuarioVo = new UsuarioVo(); 
  UsuarioDao usuarioDao =new UsuarioDao();

 
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 


        String  a = req.getParameter("accion");
        switch(a)
        {
       case "prueba" :
       System.out.println("servlet funcionando usuario"); 
          break;
        case"abrirFormUsu":
        req.getRequestDispatcher("views/usuario/RegistrarUsuarioForm.jsp").forward(req, resp);
         break; 
         
         case"abrirLogin":  
        req.getRequestDispatcher("views/usuario/Login.jsp").forward(req,resp);
         break;
         case"salir":
        req.getRequestDispatcher("index.jsp").forward(req,resp);
         break;

    
    } 
        



       
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 
     String a = req.getParameter("accion");
     switch(a){
     case"registrarUsuario":
     req.getRequestDispatcher("index.jps").forward(req, resp); 
    registarUsuario(req, resp);  
    System.out.println("boton formulario");
     break;
     case"iniciarsesion":
    iniciarsesion(req,resp);
     
     break;
     }
    }  

    private void registarUsuario(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
     int idusuario = Integer.parseInt( request.getParameter(("idUsuario")));
     

        String nombreusuario = request.getParameter("nombreUsuario");
      

       String correousuario = request.getParameter("correoUsuario");
      

        int telefono = Integer.parseInt(request.getParameter("telefono"));
     
 
      String usuario =request.getParameter("usuario");
     
      String password = request.getParameter("password");
    
      boolean estado;
     if(request.getParameter("estado") != null){
         estado = true;
    }
    else{ 
       estado=false;
        };

    UsuarioVo nuevoUsuario = new UsuarioVo(idusuario,nombreusuario,correousuario,telefono,usuario,password,estado);
    try {
       usuarioDao.registraUsuario(nuevoUsuario);
    } catch (Exception e) {
       
    }
     

      
    }

  private void iniciarsesion(HttpServletRequest request, HttpServletResponse response){
    String usuario = request.getParameter("usuario");
    String password = request.getParameter("password");
  try {
   int acceso = usuarioDao.iniciarsesion(password,usuario);
   System.out.println(acceso); 
   if (acceso==1){
   request.getRequestDispatcher("views/usuario/Menu.jsp").forward(request, response);
   } 
   else{
    String mensaje ="Su usuario Y/O contraseña son incorrectos";
    request.setAttribute("mensaje",mensaje);
   request.getRequestDispatcher("views/usuario/Login.jsp").forward(request, response); 
   System.out.println("redirigido");
   }
  } catch (Exception e) {
    System.out.println("Error al obtener el usuario por ID: " + e.getMessage());
  }
  }
  

    
}

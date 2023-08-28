package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.TerpelDao;

public class Terpel extends HttpServlet {
   TerpelDao terpelDao = new TerpelDao();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 
        String  a = req.getParameter("accion");
        switch(a)
        {
       case "prueba":
       System.out.println("servlet funcionando terpel"); 
          break;
        case"formrecargarEstacion":
        req.getRequestDispatcher("views/terpel/RecargarEstacion.jsp").forward(req, resp);
        break;  

        case"formtanquearEstacion":
        req.getRequestDispatcher("views/terpel/TanquearEstacion.jsp").forward(req, resp);
        break;
        case"volvermenu":
        req.getRequestDispatcher("views/usuario/Menu.jsp").forward(req, resp);

        break;
    }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 

      String  a = req.getParameter("accion");
        switch(a){
    case"tanquearEstacion":
      tanquearEstacion(req, resp);

  break;
  case"recargarEstacion":
  recargarEstacion(req, resp);
    
    }  

 }
      private void tanquearEstacion(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        int idEstacion =Integer.parseInt(request.getParameter("idEstacion_Terpel"));
        int cantGalones =Integer.parseInt( request.getParameter("cantGalones"));  
        try { 
               int x = terpelDao.consultarCantgalones(idEstacion);
               System.out.println(x+"la cantidad de galones" );
               int y = x-cantGalones ; 
               terpelDao.modificarCantgaloes(y, idEstacion);
               String mensaje = "la cantidad de galones tanqueados fueron"+x+"";
               request.setAttribute("mensaje",mensaje);
               request.getRequestDispatcher("views/usuario/Menu.jsp").forward(request, response);

               
          } catch (Exception e) {
             System.out.println("Error: " + e.getMessage());
        }


    }    
      private void recargarEstacion(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        int idEstacion =Integer.parseInt(request.getParameter("idEstacion_Terpel")); 
        int precioGalon = Integer.parseInt(request.getParameter("precioGalon"));
        int cantGalones =Integer.parseInt( request.getParameter("cantGalones"));  
        try { 
               int x = terpelDao.consultarCantgalones(idEstacion)+cantGalones;
               terpelDao.modificarCantgaloes(x, idEstacion); 
               String mensaje = "la cantidad de galones recargados fueron"+x+"";
               request.setAttribute("mensaje",mensaje);
               request.getRequestDispatcher("views/usuario/Menu.jsp").forward(request, response);
          } catch (Exception e) {
             System.out.println("Error al obtener el usuario por ID: " + e.getMessage());
        }


      }  
   

}





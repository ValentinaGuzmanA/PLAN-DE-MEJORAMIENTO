package controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.EstacionservicioDao;
import model.EstacionservicioVo;

public  class Estacionservicio extends HttpServlet{
EstacionservicioDao estacionservicioDao = new EstacionservicioDao(); 

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
        String  a = req.getParameter("accion");
        switch(a)
        {
       case "prueba" :
       System.out.println("servlet funcionando estacion servicio"); 
          break; 
        case "abrirformEstacion":
        req.getRequestDispatcher("views/estacionservicio/RegistrarEstacionForm.jsp").forward(req, resp);
        break;  
        case"abrirformmodificarEstacion": 
        listar(req, resp);
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
    case"registrarEstacion":
    registarEstacion(req, resp);
    break; 

    case"modificarEstacion":
    modificarEstacionEstacion(req, resp);
    break ;


      }
    } 


    private void registarEstacion(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
     int idEstacion = Integer.parseInt(request.getParameter("idEstacion"));
     String nombreEstacion = request.getParameter("nombreEstacion");
     String direccionEstacion = request.getParameter("direccionEstacion");
     Boolean estado;
     if(request.getParameter("estadoEstacion")!= null){
    estado=true;
     }
     else{ 
        estado=false;
     } 
    EstacionservicioVo nuevaestacionservicio = new EstacionservicioVo(idEstacion,nombreEstacion,direccionEstacion,estado);
        try {
     estacionservicioDao.registrarEstacion(nuevaestacionservicio); 
     request.getRequestDispatcher("views/usuario/Menu.jsp").forward(request, response);

    } catch (Exception e) { 
        System.out.println("Error al obtener el usuario por ID: " + e.getMessage());
    }
    }

  private void listar(HttpServletRequest req, HttpServletResponse resp) {
        try {
            List estaciones = estacionservicioDao.listar(); 
            System.out.println(estaciones);
            req.setAttribute("estaciones",estaciones);
            System.out.println(req.getAttribute("estaciones"));
            req.getRequestDispatcher("views/estacionservicio/ModificarEstacion.jsp").forward(req, resp); 
            System.out.println("Datos listados correctamente");
        } catch (Exception e) {
            System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
        }
    } 

  private void modificarEstacionEstacion(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
     int idEstacion = Integer.parseInt(request.getParameter("idEstacion"));
     String nombreEstacion = request.getParameter("nombreEstacion");
     String direccionEstacion = request.getParameter("direccionEstacion");
     Boolean estado;
     if(request.getParameter("estadoEstacion")!= null){
    estado=true;
     }
     else{ 
        estado=false;
     } 
    EstacionservicioVo estacionserviciomod = new EstacionservicioVo(idEstacion,nombreEstacion,direccionEstacion,estado);
        try {
      estacionservicioDao.modificarEstacion(estacionserviciomod);
           request.getRequestDispatcher("views/usuario/Menu.jsp").forward(request, response);


    } catch (Exception e) { 
        System.out.println("Error al obtener el usuario por ID: " + e.getMessage());
    }
    }


 }











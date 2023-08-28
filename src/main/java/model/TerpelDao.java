package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TerpelDao {

    Connection con; //objeto de conexión
    PreparedStatement ps; //preparar sentencias
    ResultSet rs; // almacenar consutas
    String  sql=null;
    int r; 
 
 public int consultarCantgalones(int idEstacion_Terpel)  throws SQLException{
    sql = "Select cantGalones from  terpel where idEstacion_Terpel =? "; 
    System.out.println(sql);
    try(Connection conexion = Conexion.conectar();
    PreparedStatement ps = conexion.prepareStatement(sql)){
       ps.setInt(1,idEstacion_Terpel);
       rs=ps.executeQuery();
       System.out.println(sql);
        if(rs.next()){    
            int  cantGalones = rs.getInt("cantGalones");
             return cantGalones;      
        } 
    } catch (Exception e) { 
       System.out.println("Error al consultar cantidad galones: " + e.getMessage());
    }
        return r;
    }


    public int consultaprecioGalon(int idEstacion_Terpel)  throws SQLException{
    sql = "Select precioGalon from  terpel where idEstacion_Terpel = ? "; 
    System.out.println(sql);
    try{
        con=Conexion.conectar();
        ps=con.prepareStatement(sql); 
        ps.setInt(1,idEstacion_Terpel);
       
       rs=ps.executeQuery();
       System.out.println(sql);
        if(rs.next()){    
            int  cantGalones = rs.getInt("precioGalon");
             return cantGalones;      
        } 
    } catch (Exception e) { 
       System.out.println("Error al consultar precio: " + e.getMessage());
    }
        return r;
    }


 public int modificarCantgaloes(int cantGalones ,int idEstacion_Terpel)  throws SQLException{
    sql = "update Terpel  set cantGalones = ?  where idEstacion_Terpel = ? "; 
   
    try(Connection conexion = Conexion.conectar();
    PreparedStatement ps = conexion.prepareStatement(sql)){
       ps.setInt(1,cantGalones);
       ps.setInt(2,idEstacion_Terpel);
       r=ps.executeUpdate();
       System.out.println(sql);

    } catch (Exception e) { 
       System.out.println("Error al verificar el usuario: " + e.getMessage());
    }

        return r;
    }




}

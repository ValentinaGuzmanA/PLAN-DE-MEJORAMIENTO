package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstacionservicioDao { 

         Connection con; //objeto de conexión
    PreparedStatement ps; //preparar sentencias
    ResultSet rs; // almacenar consutas
    String  sql=null;
    int r;  //cantidad de filas que devuelve una sentencia   

public int registrarEstacion (EstacionservicioVo estacion) throws SQLException{
    sql = "INSERT INTO estacionservicio VALUES (?,?,?,?)";
    try (Connection conexion = Conexion.conectar();
         PreparedStatement ps = conexion.prepareStatement(sql)) {
        ps.setInt(1, estacion.getIdEstacion() );
        ps.setString(2,estacion.getNombreEstacion());
        ps.setString(3, estacion.getDireccionEstacion());
        ps.setBoolean(4,estacion.getEstadoEstacion()); // Establecer el estado de activación
        r = ps.executeUpdate();
        System.out.println("Se registró la esatcion correctamente");
        // Crear una cuenta asociada al usuario
    } catch (Exception e) {
        System.out.println("Error en el registro:" + e.getMessage());
    }
    return r;
};


  public List<EstacionservicioVo> listar() throws SQLException{
        sql="SELECT * from estacionservicio";
        List<EstacionservicioVo> estaciones =new ArrayList<>();
        try {
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery(sql);
            while(rs.next()){
                  EstacionservicioVo estacion  =new EstacionservicioVo();  

                   estacion.setIdEstacion(rs.getInt("idEstacion"));
                   estacion.setNombreEstacion(rs.getString("nombreEstacion"));
                   estacion.setDireccionEstacion(rs.getString("direccionEstacion"));
                   estacion.setEstadoEstacion(rs.getBoolean("estadoEstacion")); 
                    System.out.println(estacion.getIdEstacion());

                   estaciones.add(estacion);   
            } 

            ps.close();
            System.out.println("consulta exitosa");
        } catch (Exception e) {
            System.out.println("La consulta no pudo ser ejecutado "+e.getMessage().toString());
        }
        finally{
            con.close();
        }
        return estaciones;
    }   


 public int modificarEstacion (EstacionservicioVo estacion) throws SQLException{
    sql =  "update estacionservicio set nombreEstacion= ? ,direccionEstacion=? ,estadoEstacion=? where idEstacion=? ;";

    try (Connection conexion = Conexion.conectar();
         PreparedStatement ps = conexion.prepareStatement(sql)) {
        
        ps.setString(1,estacion.getNombreEstacion());
        ps.setString(2, estacion.getDireccionEstacion());
        ps.setBoolean(3,estacion.getEstadoEstacion()); // Establecer el estado de activación
        ps.setInt(4, estacion.getIdEstacion());
        r = ps.executeUpdate();
        System.out.println("Se modifico  la estacion correctamente");
        // Crear una cuenta asociada al usuario
    } catch (Exception e) {
        System.out.println("Error en la modificacion :" + e.getMessage());
    }
    return r;
};








}
 

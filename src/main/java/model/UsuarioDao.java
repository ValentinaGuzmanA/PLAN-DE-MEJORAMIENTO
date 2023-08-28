package model;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDao {
     Connection con; //objeto de conexión
    PreparedStatement ps; //preparar sentencias
    ResultSet rs; // almacenar consutas
    String  sql=null;
    int r;  //cantidad de filas que devuelve una sentencia  
   public int registraUsuario(UsuarioVo nuevoUsuario) throws SQLException {
        sql = "INSERT INTO usuario VALUES (?,?,?,?,?,?,?)";
        try (Connection conexion = Conexion.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setInt(1, nuevoUsuario.getIdUsuario());
            ps.setString(2, nuevoUsuario.getNombreUsuario());
            ps.setString(3, nuevoUsuario.getCorreoUsuario());
            ps.setInt(4, nuevoUsuario.getTelefono());
            ps.setString(5, nuevoUsuario.getUsuario());
            ps.setString(6, nuevoUsuario.getPassword());
            ps.setBoolean(7, nuevoUsuario.isEstado()); // Establecer el estado de activación
            r = ps.executeUpdate();
            System.out.println(sql);
            System.out.println("Se registró el usuario correctamente");
            // Crear una cuenta asociada al usuario
        } catch (Exception e) {
            System.out.println("Error en el registro: " + e.getMessage());
        }
        return r;
    };
    public int iniciarsesion(String password , String usuario)  throws SQLException{
    sql = "Select * from usuario where usuario='"+usuario+"' and password= '"+password+"' "; 
    System.out.println(sql);
    try{
        
        con=Conexion.conectar();
        ps=con.prepareStatement(sql); 
        
        rs=ps.executeQuery(sql); 
        if(rs.next()){
        String  user = rs.getString("usuario");
        System.out.println(user);
        String pass = rs.getString("password");
        System.out.println(pass);
    if (user != null & pass != null){
      r=1;
    }      
    else{
        r=0;
    }
    } 
    } catch (Exception e) { 
       System.out.println("Error al verificar el usuario: " + e.getMessage());
    }
        return r;
    }
}

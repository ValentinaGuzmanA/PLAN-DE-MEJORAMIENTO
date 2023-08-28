package model;

public class UsuarioVo {
      
private int idUsuario;
private String nombreUsuario;
private  String correoUsuario;
private int telefono ;
private String usuario;
private String password;
private boolean estado;


public UsuarioVo(int idUsuario, String nombreUsuario, String correoUsuario, int telefono, String usuario,
        String password, boolean estado) {
    this.idUsuario = idUsuario;
    this.nombreUsuario = nombreUsuario;
    this.correoUsuario = correoUsuario;
    this.telefono = telefono;
    this.usuario = usuario;
    this.password = password;
    this.estado = estado;
}


public UsuarioVo() {
}


public int getIdUsuario() {
    return idUsuario;
}


public void setIdUsuario(int idUsuario) {
    this.idUsuario = idUsuario;
}


public String getNombreUsuario() {
    return nombreUsuario;
}


public void setNombreUsuario(String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
}


public String getCorreoUsuario() {
    return correoUsuario;
}


public void setCorreoUsuario(String correoUsuario) {
    this.correoUsuario = correoUsuario;
}


public int getTelefono() {
    return telefono;
}


public void setTelefono(int telefono) {
    this.telefono = telefono;
}


public String getUsuario() {
    return usuario;
}


public void setUsuario(String usuario) {
    this.usuario = usuario;
}


public String getPassword() {
    return password;
}


public void setPassword(String password) {
    this.password = password;
}


public boolean isEstado() {
    return estado;
}


public void setEstado(boolean estado) {
    this.estado = estado;
} 







}

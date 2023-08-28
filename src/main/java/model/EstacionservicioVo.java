package model;

public class EstacionservicioVo {
    private int idEstacion;
    private String nombreEstacion;
    private String direccionEstacion;
    private Boolean estadoEstacion;
  
  
  public EstacionservicioVo() {
  } 
  
    
  public EstacionservicioVo(int idEstacion, String nombreEstacion, String direccionEstacion, Boolean estadoEstacion) {
      this.idEstacion = idEstacion;
      this.nombreEstacion = nombreEstacion;
      this.direccionEstacion = direccionEstacion;
      this.estadoEstacion = estadoEstacion;
  }
  
  
  public int getIdEstacion() {
      return idEstacion;
  }
  
  
  public void setIdEstacion(int idEstacion) {
      this.idEstacion = idEstacion;
  }
  
  
  public String getNombreEstacion() {
      return nombreEstacion;
  }
  
  
  public void setNombreEstacion(String nombreEstacion) {
      this.nombreEstacion = nombreEstacion;
  }
  
  
  public String getDireccionEstacion() {
      return direccionEstacion;
  }
  
  
  public void setDireccionEstacion(String direccionEstacion) {
      this.direccionEstacion = direccionEstacion;
  }
  
  
  public Boolean getEstadoEstacion() {
      return estadoEstacion;
  }
  
  
  public void setEstadoEstacion(Boolean estadoEstacion) {
      this.estadoEstacion = estadoEstacion;
  }
  
}

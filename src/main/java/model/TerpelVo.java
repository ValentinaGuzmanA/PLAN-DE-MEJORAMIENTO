package model;

public class TerpelVo extends EstacionservicioVo {

    private int  precioGalon ; 
    private int  canGalones;





    
    public TerpelVo(int precioGalon, int canGalones) {
        this.precioGalon = precioGalon;
        this.canGalones = canGalones;
    }



    public TerpelVo(int idEstacion, String nombreEstacion, String direccionEstacion, Boolean estadoEstacion,
            int precioGalon, int canGalones) {
        super(idEstacion, nombreEstacion, direccionEstacion, estadoEstacion);
        this.precioGalon = precioGalon;
        this.canGalones = canGalones;
    }



    public int getPrecioGalon() {
        return precioGalon;
    }



    public void setPrecioGalon(int precioGalon) {
        this.precioGalon = precioGalon;
    }



    public int getCanGalones() {
        return canGalones;
    }



    public void setCanGalones(int canGalones) {
        this.canGalones = canGalones;
    }  
    
}

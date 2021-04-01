import java.util.Date; 

public class Insumo {

    //Todo lo que empieza con mayuscula 
    //es objeto(Date, String, etc)
    public String nombre;
    public Date fechaDeIngreso;
    public String codigoDelInsumo;
    public Date fechaDeCaducidad;
    public double precio;
    public double costo;

    public boolean estaVencido() {
        Date hoy = new Date(); //Date es un ojbeto en java que genera por defecto la fecha de hoy
        if ( this.fechaDeCaducidad.before(hoy)) {
            return true;
        }
        return false;
    }

}

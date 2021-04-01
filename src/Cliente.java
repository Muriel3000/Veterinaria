//Cliente "hereda"(extends) de Persona
public class Cliente extends Persona {

    public int codigoCliente;
    public String formaPago;
    //Tarjeta/Efectivo/Transferencia

    public String palabraSecreta;
    public void generarPalabraSecreta() { 
        this.palabraSecreta = "fjdfsjsdkfffff0";
    }

}

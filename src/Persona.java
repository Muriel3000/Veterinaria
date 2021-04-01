import java.util.Date; 

//Crear clase:
// 1- Se especifica el accesor (public; etc)
// 2 - Palabra "class"
// 3 - Nombre de la clase, debe ser exacto al nombre del archivo
// (Archivo: Persona.java; Clase: Persona)
// Por defecto hereda de la clase object

public class Persona {
    //Atributos/variables de instancia:
    //Modificador de acceso: public/private/protected
    //public: todas las otras instancias pueden acceder a la propiedad
    //Tipo de dato y nombre del atributo

    public String nombre;
    public String dni;
    //Max de int es 2147483647
    public String telefono;
    public Date fechaNacimiento;
    public String direccion;
    public String email;
    
}


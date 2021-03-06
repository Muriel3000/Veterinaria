import java.util.*;
//En lugar de escribir el listado(List,ArrayList,Properties,etc)

public class ClinicaVeterinaria {

    public String nombre;
    public String cuit; //identificador fiscal
    public String telefono;
    public String email;

    //Atributo tipo "Lista", van en PLURAL
    //public List<Tipo> nombreVariablePlural
    public List<Paciente> pacientes = new ArrayList<>();
    // <>Operador Diamond           -> lista VACIA, con 0 elementos
    public int capacidadMaxima = 20;

    public boolean hacerRevision(Paciente paciente) { 
        System.out.println("Revisando al paciente " + paciente.nombre);
        return true;
    }

    public boolean ingresar (Paciente paciente) {
        if (this.pacientes.size() < this.capacidadMaxima) { 
           this.pacientes.add(paciente);
           return true; 
        }
        return false;
    }

    public void imprimirListadoPacientes() {
        System.out.println("**********LISTADO**********");
        //For each paciente en pacientes, es un ciclo for especial
        //que permite iterar/recorrer listas asignando a una variable 
        //antes del : el valor de cada elemento
        for ( Paciente paciente : pacientes) {
            //imprimo el atributo nombre del paciente
            System.out.println("Paciente Ingresado: " + paciente.nombre);
        }
        System.out.println("**********************");
    }
}

//Veterinaria

public class App {
    public static void main(String[] args) throws Exception {
        
        //Paciente

        //Variable local "michi", de tipo Paciente
        Paciente michi = new Paciente();
        michi.nombre = "Mabel";
        michi.especie = "gati";

        Paciente perrito = new Paciente();
        perrito.nombre = "Rubencio";
        perrito.especie = "perrito";

        Paciente agatha = new Paciente();
        agatha.nombre = "Agatha";
        agatha.especie = "gati";

        ClinicaVeterinaria vete = new ClinicaVeterinaria();
        vete.nombre = "Pupis";

        System.out.println("El nombre del primer paciente es " + michi.nombre);
        System.out.println("El nombre del segundo paciente es " + perrito.nombre);
        System.out.println("El nombre del tercer paciente es " + agatha.nombre);
 
        //Dueño de paciente

        Cliente dueño1 = new Cliente();
        dueño1.nombre = "Pedro";
        michi.dueño = dueño1;

        /* 
          Cliente dueño2 = new Cliente();
          dueño2.nombre = "Liliana";
          System.out.println("El dueño del segundo paciente es "+ perrito.dueño.nombre);
        
          Si se ejectua se rompe, porque no asigne al dueño de perrito,
          generando un NullPointerException
        */

        Cliente dueño2 = new Cliente();
        dueño2.nombre = "Liliana";
        perrito.dueño = dueño2;
        agatha.dueño = dueño2;

        // Cliente dueño2 = new Cliente();
        // aghata.dueño = dueño2;
        // agatha.dueño.nombre = "Liliana";

        //Estoy modificando dueño2
        agatha.dueño.nombre = "Lucas";
        agatha.dueño.generarPalabraSecreta();

        System.out.println("El dueño del primer paciente es " + michi.dueño.nombre);
        System.out.println("El dueño del segundo paciente es " + perrito.dueño.nombre);
        System.out.println("El dueño del tercer paciente es " + agatha.dueño.nombre);

        vete.hacerRevision(perrito);//Deberia imprimir
        vete.ingresar(perrito);    
        // Ya ingresé a perrito(paciente) a vete(ClinicaVeterinaria)(Max de 20 pacientes)
        // vete.pacientes.add(perrito); Si lo hicera de vuelta de esta forma, lo ingresaría dos veces
        
        vete.pacientes.add(michi);
        vete.pacientes.add(agatha);

        vete.imprimirListadoPacientes();
    }
}

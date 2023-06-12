package Reto1.Principal;

import Reto1.Salud.Persona;

public class Inicio {
    
    public static void main(String[] args) {
        
        //Instanciar la clase Persona 
        Persona datos=new Persona();

        datos.pedirDatos();

        datos.mostrarPersona();

        datos.calcularlmc();

        datos.mayorEdad();
    }
}

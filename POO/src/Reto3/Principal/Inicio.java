package Reto3.Principal;

import Reto3.Salud.Empleado;
import Reto3.Salud.Persona;
import java.util.Scanner; 

public class Inicio {
    
    public static void main(String[] args) {

        
        //Instanciar la clase Persona 
        Persona datos=new Persona();
        //Instanciar la clase empleado
        Empleado empleado=new Empleado();
 
        //Solicitar datos de cada clase 
        empleado.pedirDatos();
        empleado.solicitarDatos();
        empleado.calcularHonorarios(empleado.getValorHora(), empleado.getHorasTrabajadas());
        empleado.mostrarEmpleados();

    }
}

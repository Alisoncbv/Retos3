package Reto2.Principal;

//Importar clase Persona 
import java.util.Scanner;
import Reto2.Salud.Persona;

public class Inicio {

    public static void main(String[] args) {
        
        Double peso;
        Double estatura;

        //Instanciar la clase Persona
        Persona datos=new Persona();
        
        datos.pedirDatos();

        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese su peso");
        peso=leer.nextDouble();
        System.out.println("Ingrese su estatura");
        estatura=leer.nextDouble();
        
        datos.mostrarPersona(peso, estatura);

        Double pesoActual = datos.calcularlmc(peso, estatura);
        
        if(pesoActual <20){
            System.out.println("Su peso esta por debajo de lo ideal");
        
        }else if(pesoActual >=20 && pesoActual <=25){
            System.out.println("Su peso es ideal");

        }else if(pesoActual>25){
            System.out.println("Tiene sobre peso");
        }


    }
}

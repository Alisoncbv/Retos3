package Introduccion;

import java.util.Scanner;

public class Ejecucion {

    public static void main(String[] args) {
         
        String nombreE;
        
        //Instanciar la clase Enfermedad
        Enfermedad enfermedad=new Enfermedad();

        enfermedad.registrarEnfermedad();

        //Instanciar clase Cancer 
        Cancer cancer=new Cancer();

        cancer.registrarEnfermedad();
        cancer.registrarCancer();
        cancer.mostrarEnfermedad();
        

/*        
        //Concultar get
        System.out.println(enfermedad.getNomEnfermedad());

        //Asignar set sin solicitarlo al usuario 
        enfermedad.setNomEnfermedad("Covid");

        //Asignar set solicitando el dato al usuario 
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el nombre de la enfermedad");
        nombreE=leer.next();

        enfermedad.setNomEnfermedad(nombreE);
*/

        
        
        

         /*
        //Invocar metodos (argumentos)
        dato.calcularEdad(2006);

        //Calculadora 

       Calculadora operacion=new Calculadora();

        //Instanciar clase Scanner 
        Scanner leer=new Scanner(System.in);

        //Solicitar datos Suma 
        System.out.println("Ingrese el primer número");
        Double num1=leer.nextDouble();
        System.out.println("Ingrese el segundo número");
        Double num2=leer.nextDouble();

        operacion.sumar(num1, num2);
        operacion.restar(num1, num2);
        operacion.multiplicación(num1, num2);
        operacion.división(num1, num2);
    */
    }
    
}

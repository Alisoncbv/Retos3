package Introduccion;

import java.util.Scanner;
public class Enfermedad {

    //Atributos 
    //Modificador de acceso Privado
    private int idEnfermedad;
    private String nomEnfermedad;

    //Metodo contructor vacio 
    public Enfermedad(){

    }

    //Metodo contructor con parametros 
    public Enfermedad(int idEnfermedad, String nomEnfermedad){
        this.idEnfermedad = idEnfermedad;
        this.nomEnfermedad = nomEnfermedad;
    }

    //Metodos accesores
    //Getters 
    public int getIdEnfermedad(){
        return idEnfermedad;
    }

    public String getNomEnfermedad() {
        return nomEnfermedad;
    }

    
    //Setters 
    public void setIdEnfermedad(int idEnfermedad) {
        this.idEnfermedad = idEnfermedad;
    }

    public void setNomEnfermedad(String nomEnfermedad) {
        this.nomEnfermedad = nomEnfermedad;
    }

    //Metodos
    //Modificador de acceso-valor de retorno-nombre metodo + ()

    //Metodo para registrar la enfermedad
    public void registrarEnfermedad(){

        //Instanciar clase Scanner 
        Scanner leer=new Scanner(System.in);

        //Solicitar código
        System.out.println("Ingrese el código de la enfermedad");
        idEnfermedad=leer.nextInt();

        //Solicitar nombre del usuario 
        System.out.println("¿Cual es el nombre de la enfermedad?");
        nomEnfermedad=leer.next();     
    }

    /* 
    //Metodo para mostrar
    public void mostrar(){
        System.out.println("El id de la enfermedad es: "+idEnfermedad);
        System.out.println("El nombre de la enfermedad es: "+nomEnfermedad);

    }
    */

    /* 
    //Sobrecarga

    //metodo con parametros 
    public void calcularEdad(int añoN){

        //Declarar varaibles
        int añoA;
        //Instanciar clase Scanner
        Scanner leer=new Scanner(System.in);

        //Solicitar datos
        System.out.println("Ingrese el año actual");
        añoA=leer.nextInt();
       
        //Realizar operación 
        edad=añoA-añoN;
        System.out.println(edad);
    }

    public void calcularEdad(){
        
        //Declarar varaibles
        int añoA, añoN;
        //Instanciar clase Scanner
        Scanner leer=new Scanner(System.in);

        //Solicitar datos
        System.out.println("Ingrese su año de nacimiento");
        añoN=leer.nextInt();

        System.out.println("Ingrese el año actual");
        añoA=leer.nextInt();
       
        //Realizar operación 
        edad=añoA-añoN;
        System.out.println(edad);

    }
 */


    
}

package Introduccion;

import java.util.Scanner;

public class Cancer extends Enfermedad{

    //Atributos 
    private String nomPersona;
    private int edadA;
    private int edadD; 

    //Metodo constructor vacio
    public Cancer(){

    }

    //Metodo constructor con parametros 
    public Cancer(int idEnfermedad, String nomEnfermedad, String nomPersona, int edadA, int edadD){
        super(idEnfermedad,nomEnfermedad);
        this.nomPersona = nomPersona;
        this.edadA = edadA;
        this.edadD = edadD;
    }
    
    public void registrarCancer(){
        Scanner leer=new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        nomPersona=leer.next();
        System.out.println("Ingrese su edad");
        edadA=leer.nextInt();
        System.out.println("¿A que edad desarrollo la enfermedad?");
        edadD=leer.nextInt();
    }
    
    //Metodo para mostrar
    public void mostrarEnfermedad(){
        System.out.println("El nombre de la persona es: "+nomPersona);
        System.out.println("Actualmente tiene "+edadA+" años");
        System.out.println("El nombre de la enfermedad que presenta es: "+getNomEnfermedad()+
        " y la desarrollo a los: "+edadD+" años");
    }
}

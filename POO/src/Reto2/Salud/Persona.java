package Reto2.Salud;

import java.util.Scanner;
public class Persona {
    
     //Atributos 
     private String tipoDoc;
     private int documento;
     private String nombre; 
     private String apellido;
     private int edad;
     private Double peso;
     private Double estatura;
     private String sexo;
 
     //Metodo contructor vacio 
     public Persona(){

     } 

     //Metodo constructor con parametros 
     public Persona(String tipoDoc, int documento, String nombre, String apellido, int edad, Double peso,
        Double estatura, String sexo) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.sexo = sexo;
    }
     
     //Metodo para solicitar datos
     public void pedirDatos(){
 
         //Instanciar la clase Scanner 
         Scanner leer=new Scanner(System.in);
 
          //Solicitar datos
          System.out.println("Ingrese su nombre");
          nombre=leer.next();
 
          System.out.println("Ingrese su apellido");
          apellido=leer.next();
 
          System.out.println("Ingrese su tipo de documento");
          tipoDoc=leer.next();
 
          System.out.println("Ingrese su número de documento");
          documento=leer.nextInt();
 
          System.out.println("Ingrese su edad");
          edad=leer.nextInt();
 
          System.out.println("Ingrese su genero");
          sexo=leer.next();
         }

        //Metodo para mostrar los datos de la persona
        public void mostrarPersona(Double peso, Double estatura){

            System.out.println("El nombre de la persona es: " +nombre);
            System.out.println("El apellido de la persona es: " +apellido);
            System.out.println("El tipo de documento de la persona es: " +tipoDoc);
            System.out.println("El número de documento de la persona es: " +documento);
            System.out.println("La edad de la persona es: " +edad);
            System.out.println("El peso de la persona es: "+peso);
            System.out.println("La estatura de la persona es: "+estatura);
            System.out.println("El genero de la persona es: " +sexo);
        }

        
        //Metodo para realizar los calculos 
        public Double calcularlmc(Double peso, Double estatura){

            Double pesoActual = peso/Math.pow(estatura, 2);
            return pesoActual;
        }
}

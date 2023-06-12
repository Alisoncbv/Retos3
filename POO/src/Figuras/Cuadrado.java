package Figuras;

import java.util.Scanner;
public class Cuadrado extends Figura{

    //Atributos
    private int lado;

    //Metodo constructor vacio
    public Cuadrado(){

    }

    //Metodo constructor con parametros
    public Cuadrado(int lado){
        super();
        this.lado=lado;
    }

    //Metodo para solicitar datos 
    public void registrarDatos(){
        Scanner leer=new Scanner(System.in);

        System.out.println("Ingrese el valor del lado del cuadrado");
        lado=leer.nextInt();

    }


    //Metodo para calcular el area 
    public void calcularArea(){
        float area=lado*lado;
        System.out.println("El lado del cuadadrado es: "+lado+" y el area del cuadadro es: "+area);

    }

    
}

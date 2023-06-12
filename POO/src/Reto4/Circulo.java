package Reto4;

import java.util.Scanner;

public class Circulo extends Figura{

    //Atributos 
    private Double radio;

    //Metodo constructor vacio
    public Circulo(){

    }

    //Metodo constructor con parametros 
    public Circulo(Double radio){
        super();
        this.radio=radio;
    }

    //Metodo para solicitar datos
    public void solicitarCirculo(){

        //Instanciar clase Scanner
        Scanner leer=new Scanner(System.in);

        //Solicitar datos 
        System.out.println("Ingrese el valor del radio del circulo");
        radio=leer.nextDouble();
    }

    //Metodo para calcular area 
    public void calcularArea(){
        Double areaCirculo; 

        areaCirculo=3.1416 * Math.pow(radio,2);

        //Mostrar resultado 
        System.out.println("El area del circulo es: "+areaCirculo);
            
        
    }


    
}

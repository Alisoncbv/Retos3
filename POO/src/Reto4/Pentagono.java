package Reto4;

import java.util.Scanner;

public class Pentagono extends Figura{

    //Atributos 
    private Double perimetro;
    private Double apotema; 

    //Metodo constructor vacio 
    public Pentagono(){

    }
    
    //Metodo constructor con parametros 
    public Pentagono(Double perimetro, Double apotema){
        super();
        this.perimetro=perimetro;
        this.apotema=apotema;
    }

    //Metodo para solicitar datos 
    public void solicitarPentagono(){

        //Instanciar clase Scanner 
        Scanner leer=new Scanner(System.in);

        //Solicitar datos 
        System.out.println("Ingrese el valor del perimetro del pentagono");
        perimetro=leer.nextDouble();
        System.out.println("Ingrese el valor del apotema del pentagono");
        apotema=leer.nextDouble();
    }

    //Metodo para calcular area 
    public void calcularArea(){

        Double areaPentagono; 

        areaPentagono=((perimetro*apotema)/2);

        //Mostrar resultado 
        System.out.println("El area del pentagono es: "+areaPentagono);
    }
}

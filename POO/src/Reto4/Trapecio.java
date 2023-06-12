package Reto4;

import java.util.Scanner;

public class Trapecio extends Figura {

    //Atributos 
    private Double base1;
    private Double base2; 
    private Double altura; 

    //Metodo contructor vacio 
    public Trapecio(){

    }
    
    //Metodo contructor con parametros 
    public Trapecio(Double base1, Double base2, Double altura){
        super();
        this.base1=base1;
        this.base2=base2;
        this.altura=altura;
    }

    //Metodo para solicitar datos 
    public void solicitarTrapecio(){

        //Instanciar clase Scanner 
        Scanner leer=new Scanner(System.in);

        //Solicitar datos 
        System.out.println("Ingrese le valor del lado paralelo 1 del trapecio");
        base1=leer.nextDouble();
        System.out.println("Ingrese el valor del lado paralelo 2 del trapecio");
        base2=leer.nextDouble();
        System.out.println("Ingrese el valor de la altura del Trapecio");
        altura=leer.nextDouble();
    }

    //Metodo para calcular el area 
    public void calcularArea(){

        Double areaTrapecio; 

        areaTrapecio=(((base1+base2)*altura)/2);

        //Mostrar resultado
        System.out.println("El area del trapecio es: "+areaTrapecio);
    }
}

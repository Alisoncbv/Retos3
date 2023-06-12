package Reto4;

//Importar clase Scanner 
import java.util.Scanner;

public class Rombo extends Figura{
    
    //Atributos 
    private Double mayorD;
    private Double menorD;

    //Metodo constructor vacio
    public Rombo(){

    } 

    //Metodo constructor con parametros
    public Rombo(Double mayorD, Double menorD){
        super();
        this.mayorD=mayorD;
        this.menorD=menorD;
    }

    //Metodo para solicitar los datos 
    public void solicitarRombo(){

        //Instanciar clase Scanner 
        Scanner leer=new Scanner(System.in);

        //Solicitar datos 
        System.out.println("Ingrese el valor de la diagonal mayor del rombo");
        mayorD=leer.nextDouble();

        System.out.println("Ingrese el valor de la diagonal manor del rombo");
        menorD=leer.nextDouble();


    }

    //Metodo para calcular area 
    public void calcularArea(){

        Double areaRombo;

        areaRombo=((mayorD*menorD)/2);

        //Mostrar resultado 
        System.out.println("El area del rombo es: "+areaRombo);

    }
}

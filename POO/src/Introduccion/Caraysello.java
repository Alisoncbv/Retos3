package Introduccion;

import java.util.Random;
import java.util.Scanner;

public class Caraysello implements Juego{

    //Atributos 
    private int moneda;
    private String jugador;
    private int eleccion;

    //Metodo constructor vacio 
    public Caraysello(){

    }

    //Metodo constructor con parametros 
    public Caraysello(int moneda, String jugador, int eleccion) {
        this.moneda = moneda;
        this.jugador = jugador;
        this.eleccion = eleccion;
    }


    //Metodos 
    public void iniciar(){
        Scanner leer=new Scanner(System.in);

        //Solicitar datos 
        System.out.println("Ingrese su nombre");
        jugador=leer.next();
    }

    public void jugar(){
        Scanner leer=new Scanner(System.in);

        //Solicitar elección 
        System.out.println("Realice su elección \n 1. Cara \n 2. Sello");
        eleccion=leer.nextInt();

        //Metodo Random
        Random aleatorio=new Random();
        moneda=aleatorio.nextInt(2)+1;
        
        System.out.println("Moneda girando");
    }

    public void finalizar(){

        if(moneda==1 && eleccion==1){
            System.out.println("Cayó cara, ganaste "+jugador);

        }else if(moneda==2 && eleccion==2){
            System.out.println("Cayó sello, ganaste "+jugador);

        }else if(moneda==1 && eleccion==2){
            System.out.println("Cayó cara, perdiste "+jugador);

        }else if(moneda==2 && eleccion==1){
            System.out.println("Cayó sello, perdiste "+jugador);
        }  
    }
}

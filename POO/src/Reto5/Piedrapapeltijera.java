package Reto5;

import java.util.Random;
import java.util.Scanner;

public class Piedrapapeltijera implements Juego{

     //Atributos
    private String nombre;
    private int opcionJugador;
    private int eleccionM;


    //Metodos constructor vacio
    public Piedrapapeltijera(){

    }
    
    //Metodo constructor con parametros 
    public Piedrapapeltijera(String nombre, int opcionJugador, int eleccionM) {
        this.nombre = nombre;
        this.opcionJugador = opcionJugador;
        this.eleccionM = eleccionM;
    }
    
    
    //Metodos 
    public void iniciar(){
        Scanner leer=new Scanner(System.in);

        //Solicitar nombre 
        System.out.println("Ingrese su nombre");
        nombre=leer.next();
    }

    public void jugar(){
        Scanner leer=new Scanner(System.in);

        //Solicitar elección 
        System.out.println("Jugaremos piedra, papel o tijera \n ¡Empecemos!");
        System.out.println("0. Piedra 1. Papel o 2. Tijera");
        opcionJugador=leer.nextInt();

        //Metodo Random
        Random aleatorio=new Random();
        eleccionM=aleatorio.nextInt(3);
    }

    public void finalizar(){

        if (opcionJugador < 0 || opcionJugador > 2) {
                System.out.println("No es una opción validad");
                return;
            }

            if (opcionJugador == eleccionM) {
                System.out.println("Usted saco: " + opcionJugador);
                System.out.println("El programa saco: " + eleccionM);
                System.out.println("El programa y usted sacaron lo mismo, fue empate");
            } else if (opcionJugador == 0 && eleccionM == 1) {
                System.out.println("Usted saco: " + opcionJugador);
                System.out.println("El programa saco: " + eleccionM);
                System.out.println("Lo sentimos usted perdió");

            } else if (opcionJugador == 0 && eleccionM == 2) {
                System.out.println("Usted saco: " + opcionJugador);
                System.out.println("El programa saco: " + eleccionM);
                System.out.println("¡Felicitaciones, usted ganó!");

            } else if (opcionJugador == 1 && eleccionM == 0) {
                System.out.println("Usted saco: " + opcionJugador);
                System.out.println("El programa saco: " + eleccionM);
                System.out.println("¡Felicitaciones, usted ganó!");

            } else if (opcionJugador == 1 && eleccionM == 2) {
                System.out.println("Usted saco: " + opcionJugador);
                System.out.println("El programa saco: " + eleccionM);
                System.out.println("Lo sentimos usted perdió");

            } else if (opcionJugador == 2 && eleccionM == 0) {
                System.out.println("Usted saco: " + opcionJugador);
                System.out.println("El programa saco: " + eleccionM);
                System.out.println("Lo sentimos usted perdió");

            } else if (opcionJugador == 2 && eleccionM == 1) {
                System.out.println("Usted saco: " + opcionJugador);
                System.out.println("El programa saco: " + eleccionM);
                System.out.println("¡Felicitaciones, usted ganó!");

            }

        }
}

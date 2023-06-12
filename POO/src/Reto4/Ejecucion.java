package Reto4;

import java.util.Scanner;
public class Ejecucion {
    public static void main(String[] args) {
        
        //Instanciar la clase Scanner 
        Scanner leer=new Scanner(System.in);

        int contador=0;
        String respuesta;
        int figura; 

        do{
            System.out.println("¿De que figura desea calcular el area?");
            System.out.println("\n 1. Rombo \n 2. Trapecio \n 3. Pentagono \n 4. Circulo");
            figura=leer.nextInt();

                switch(figura){

                    case 1:
                        //Instanciar clase Rombo
                        Rombo r=new Rombo();

                        r.solicitarRombo();
                        r.calcularArea();
                        break;
                    
                    case 2: 
                        //Instanciar clase Trapecio 
                        Trapecio t=new Trapecio();

                        t.solicitarTrapecio();
                        t.calcularArea();
                        break;
                    
                    case 3: 
                        //Instanciar clase Pentagono
                        Pentagono p=new Pentagono();

                        p.solicitarPentagono();
                        p.calcularArea();
                        break;
                    
                    case 4: 
                        //Instanciar clase Circulo 
                        Circulo c=new Circulo();

                        c.solicitarCirculo();
                        c.calcularArea();
                        break;
                }
            
            //Contador de intentos 
            contador=contador+1;

            System.out.println("¿Desea calcular el area de otra figura? si/no");
            respuesta=leer.next();

        }while(respuesta.equals("si"));

        System.out.println("Usted cálculo el área de "+contador+ " figuras");
        

    }
    
}

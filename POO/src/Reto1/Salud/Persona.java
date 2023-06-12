package Reto1.Salud;

//Importar clase Scanner 
import java.util.Scanner;

public class Persona {
    
    //Atributos 
    private String tipoDoc;
    private int documento;
    private String nombre; 
    private String apellido;
    private Double peso;
    private Double estatura;
    private int edad;
    private String sexo;

    //Metodo constructor vacio 
    public Persona() {
    }
    
    //Metodo constructor con parametros 
    public Persona(String tipoDoc, int documento, String nombre, String apellido, Double peso, Double estatura,
    int edad, String sexo) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
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

         System.out.println("Ingrese su peso");
         peso=leer.nextDouble();

         System.out.println("Ingrese estatura");
         estatura=leer.nextDouble();
        }

        //Metodo para mostrar los datos de la persona
        public void mostrarPersona(){

            System.out.println("El nombre de la persona es: " +nombre);
            System.out.println("El apellido de la persona es: " +apellido);
            System.out.println("El tipo de documento de la persona es: " +tipoDoc);
            System.out.println("El número de documento de la persona es: " +documento);
            System.out.println("La edad de la persona es: " +edad);
            System.out.println("El genero de la persona es: " +sexo);
            System.out.println("El peso de la persona es: " +peso);
            System.out.println("La estatura de la persona es: " +estatura);
        }

        //Metodo para realizar los calculos 
        public void calcularlmc(){
            Double pesoActual = peso/Math.pow (estatura , 2);

            if(pesoActual <20){
                System.out.println("Su peso esta por debajo de lo ideal");
            
            }else if(pesoActual >=20 && pesoActual <=25){
                System.out.println("Su peso es ideal");

            }else if(pesoActual>25){
                System.out.println("Tiene sobre peso");
            }
        }

        //Metodo para validar si es mayor o no de edad
        public void mayorEdad(){

            if(edad < 18){
                System.out.println("Usted es menor de edad");
            
            }else if(edad>=18){
                System.out.println("Usted es mayor de edad");
            }
        }
}

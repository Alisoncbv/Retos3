package Reto3.Salud;

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
    

    //Metodos 

    //Metodo Contructor vacio 
    public Persona() {
    }
    

    //Metodo constructor con parametros
    public Persona(String tipoDoc, int documento, String nombre, String apellido) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Getters 
    public String getTipoDoc() {
        return tipoDoc;
    }


    public int getDocumento() {
        return documento;
    }


    public String getNombre() {
        return nombre;
    }


    public String getApellido() {
        return apellido;
    }

    //Setters 

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }


    public void setDocumento(int documento) {
        this.documento = documento;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
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
        }

}

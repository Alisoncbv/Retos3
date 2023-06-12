package Reto3.Salud;

//Importar clase Scanner 
import java.util.Scanner;

public class Empleado extends Persona{

    //Atributos 
    private String cargo;
    private Double valorHora;
    private Double  horasTrabajadas; 
    private String departamento; 

    //Metodos 
    //Metodo constructor 
    public Empleado(){

    }
    
    public Empleado(String tipoDoc, int documento, String nombre, String apellido, String cargo, 
                     Double valorHora, Double horasTrabajadas, String departamento){
                    
    super(tipoDoc, documento, nombre, apellido);
    this.cargo=cargo; 
    this.valorHora=valorHora; 
    this.horasTrabajadas=horasTrabajadas;
    this.departamento=departamento;
    }

    
    //Metodo getters y setters 
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(Double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    
    //Metodo para solicitar datos 
    public void solicitarDatos(){
        //Instanciar la clase Scanner 
        Scanner leer=new Scanner(System.in);

        //Solicitar y capturar datos 
        System.out.println("Ingrese el cargo que ejerce");
        cargo=leer.next();
        System.out.println("Ingrese el valor por horas");
        valorHora=leer.nextDouble();
        System.out.println("¿Cuantas horas trabajo?");
        horasTrabajadas=leer.nextDouble();
       

    }

    //Metodo para calcular honorarios 
    public Double calcularHonorarios(Double valorHora, Double horasTrabajadas){
        Double hono = horasTrabajadas*valorHora;
        Double honorario = hono*0.00966;
        Double totalHono = hono-honorario;
        System.out.println("El honorario de la persona correponde a: "+totalHono);
        return totalHono;
    }

    //Metodo para mostrar 
    public void mostrarEmpleados(){
        System.out.println("El nombre de la persona es: "+getNombre());
        System.out.println("El apellido de la persona es: "+getApellido());
        System.out.println("El tipo de documento de la persona es: "+getTipoDoc());
        System.out.println("El número de documento de la persona es: "+getDocumento());
        System.out.println("El cargo que ejerce la persona es: "+cargo);
        System.out.println("La persona trabajo "+horasTrabajadas+" horas");
        System.out.println("El valor por hora es: "+valorHora);
    }
}

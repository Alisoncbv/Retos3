package Introduccion;

//Importar clase Scanner

public class Calculadora {

    //Atributos 
    Double num1;
    Double num2;

    
    //Sobrecarga 
    //Metodo constructor sin parametros- crear un objeto
    public Calculadora() {
    }

    //Metodo constructor con parametros- inicializar los atributos de la clase
    public Calculadora(Double num1, Double num2){
        this.num1 = num1;
        this.num2 = num2;
    }


    //Metodo Sumar 
    public Double sumar(Double num1, Double num2){

        //Declarar variables 
        Double suma=num1+num2;
        System.out.println("El resultado de la suma es: "+suma);
        return suma;
    }

    
    //Metodo Restar 
    public Double restar(Double num1, Double num2){

        //
        Double resta=num1-num2;
        System.out.println("El resultado de la resta es: "+resta);
        return resta;

    }

    //Metodo Multiplicar 
    public Double multiplicación(Double num1, Double num2){

        //
        Double multiplicar=num1*num2;
        System.out.println("El resultado de la multiplicación es: "+multiplicar);
        return multiplicar;
    }

    //Metodo Multiplicar 
    public Double división(Double num1, Double num2){

        //
        Double dividir=num1/num2;
        System.out.println("El resultado de la división es: "+dividir);
        return dividir;
    }


}

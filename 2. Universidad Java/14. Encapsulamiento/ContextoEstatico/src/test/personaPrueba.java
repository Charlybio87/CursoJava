package test;

import domain.Persona;

public class personaPrueba {
    private int contador;
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        System.out.println("persona1 = " + persona1);
        imprimir(persona1);
        Persona persona2 = new Persona("Carlos");
        System.out.println("persona2 = " + persona2);
        imprimir(persona2);
        //this.contador = 10; no se pude acceder por no ser estatica dentro de un metodo estatico
    }

    public static void imprimir (Persona persona){
        System.out.println("persona por metodo imprimir: " + persona);
    }
    public int getContador(){//metodo no estatico es un metodo dinamico
        imprimir(new Persona ("Santino"));// se puede mandar a llamar metodo estatico imprimir
        return this.contador;// se puede acceder a la variable contador sin problema
    }
}

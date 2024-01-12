package test;

import dominio.Persona;

import java.util.Scanner;

public class PersonaPrueba {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        Persona persona1 = new Persona("Juan", 5000.00, false);
        Persona persona2 = new Persona(null,0,false);

        System.out.println("persona1 nombre: " + persona1.getNombre());
        persona1.setNombre("Juan Carlos");
        System.out.println("persona1 nombre: " + persona1.getNombre());
        System.out.println("persona1 sueldo: " + persona1.getSueldo());
        System.out.println("persona1 eliminado: " + persona1.isEliminado());

        System.out.println("Nuevo Objeto: persona2");
        System.out.print("Ingrese nombre2: ");
        persona2.setNombre(consola.nextLine());
        System.out.print("Ingrese sueldo2: ");
        persona2.setSueldo(Integer.parseInt(consola.nextLine()));
        System.out.print("Ingrese si esta eliminado2: ");
        persona2.setEliminado(consola.hasNext());
        System.out.println("persona2 nombre2: " + persona2.getNombre());
        System.out.println("persona2 sueldo2: " + persona2.getSueldo());
        System.out.println("persona2 eliminado2: " + persona2.isEliminado());

        System.out.println("persona1: " + persona1.toString());
        System.out.println("persona2: " + persona2);
    }
}

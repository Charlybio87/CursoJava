package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        //Persona persona2 = null;
        Persona persona2 = new Persona();
        persona1.nombre = "Juan";
        System.out.println("persona1 nombre: " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("persona1 cambio nombre: " + persona1.nombre);
        persona1 = cambiarValorReturn(persona1);
        System.out.println("persona1 return nombre: " + persona1.nombre);
        persona2 = cambiarValorReturnNull(persona2);
    }
    public static void cambiarValor(Persona persona) {
        persona.nombre = "Carla";
    }
    public static Persona cambiarValorReturn(Persona persona) {
        persona.nombre = "Santino";
        return persona;
    }
    public static Persona cambiarValorReturnNull(Persona persona){
        // Validacion si el objeto persona2 tiene algun valor
        if (persona == null){
            System.out.println("Valor de persona invalida: null");
            return null;
        }
        persona.nombre = "Pilar";
        System.out.println("persona2 return/null nombre: " + persona.nombre);
        return persona;
    }
}

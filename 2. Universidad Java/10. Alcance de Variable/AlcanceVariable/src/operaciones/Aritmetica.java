package operaciones;

public class Aritmetica {
    //Atributos de la clase
    //(Variable de Clase)
    int a;
    int b;
    //Constructor Vacio
    public Aritmetica() {
        System.out.println("Ejecutando Constructor");
    }

    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor " +
                "con argumentos");
    }
}
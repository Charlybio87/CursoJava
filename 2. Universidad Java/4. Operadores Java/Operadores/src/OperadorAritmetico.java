public class OperadorAritmetico {
    public static void main(String[] args) {
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("resultado suma= " + resultado);

        resultado = a - b;
        System.out.println("resultado resta= " + resultado);

        resultado = a * b;
        System.out.println("resultado multiplicación= " + resultado);

        resultado = a / b; // resultado = 1. Por haberlo definido como tipo entero.
        System.out.println("resultado division= " + resultado);

        var resultado2 = 3.0 / b; //var resultado2 = 3D o (3F) / b;
        System.out.println("resultado2 division= " + resultado2);

        resultado2 = a % b;
        System.out.println("resultado2 modulo= " + resultado2);

        if (a % 2 == 0 )
            System.out.println("El numero es par.");
        else
            System.out.println("El numero es impar.");

    }
}

import java.util.Scanner;
public class ConversionTipos {
    public static void main(String[] args) {

        //Conversion tipo String a un int
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        var  valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);

        //Pedir un valor
        var consola = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);

        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);

        System.out.println("Ingrese un caracter: ");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);

    }
}

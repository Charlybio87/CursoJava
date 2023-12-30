import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");

        var usuario = "Carlos";
        System.out.println("usuario = " + usuario);

        System.out.println("Ingresar nombre: ");
        var usuario2 = consola.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Ingrese su titulo: ");
        var titulo = consola.nextLine();
        System.out.println("titulo = " + titulo);

        System.out.println("Resultado: " + titulo + " " + usuario2);

    }
}

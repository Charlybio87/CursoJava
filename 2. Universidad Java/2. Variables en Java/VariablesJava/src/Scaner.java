import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);

        var usuario = "Carlos";
        System.out.println("usuario = " + usuario);

        System.out.println("Ingresar nombre: ");
        var usuario2 = consola.nextLine();
        System.out.println("usuario2 = " + usuario2);

    }
}

import java.util.Scanner;

public class TipoBooleano {
    public static void main(String[] args) {
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);

        if (varBoolean){ //es verdadera!?
            System.out.println("La bandera es verdadera.");
        }
        else {
            System.out.println("La bandera es falsa.");
        }

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");

        var edad = teclado.nextInt();
        //var esAdulto= edad >= 18;

        if (edad >= 18) {
            System.out.println("Erese mayor de edad.");
        }
        else{
            System.out.println("No eres mayor de edad.");
        }
    }
}

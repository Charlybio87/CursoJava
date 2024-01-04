import java.util.Scanner;

public class EstructuraSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Ingrese un numero 1 al 4: ");
        var numero = Integer.parseInt(teclado.nextLine());
        var numeroTexto = "Valor Desconocido";

        switch (numero){
            case 1:
                numeroTexto = "uno";
                break;
            case 2:
                numeroTexto = "dos";
                break;
            case 3:
                numeroTexto = "tres";
                break;
            case 4:
                numeroTexto = "cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}

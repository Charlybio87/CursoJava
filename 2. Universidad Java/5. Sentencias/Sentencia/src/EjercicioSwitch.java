import java.util.Scanner;

public class EjercicioSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Ingrese mes (1 al 12): ");
        var mes = Integer.parseInt(teclado.nextLine());
        var estacion = "Valor Desconocido";

        switch (mes){
            case 1: case 2: case 12:
                estacion = "Verano";
                break;
            case 3: case 4: case 5:
                estacion = "otoño";
                break;
            case 6: case 7: case 8:
                estacion = "invierno";
                break;
            case 9: case 10: case 11:
                estacion = "primavera";
                break;
            default:
                estacion = "Caso no encontrado";
        }
        System.out.println("estacion = " + estacion);
    }
}

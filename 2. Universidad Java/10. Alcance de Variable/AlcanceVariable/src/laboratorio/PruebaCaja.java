package laboratorio;

import java.util.Scanner;

public class PruebaCaja {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int a1 = 3;
        int a2 = 2;
        int p1 = 6;

        Caja caja0 = new Caja();
        caja0.ancho = a1;
        caja0.alto = a2;
        caja0.profundo = p1;
        int resultado = caja0.volumenCaja();
        System.out.println("Volumen de la Caja0 = " + resultado);

        System.out.println("Ingresar ancho, alto y profundo: ");
        var medidaAncho = Integer.parseInt(teclado.nextLine());
        var medidaAlto= Integer.parseInt(teclado.nextLine());
        var medidaProfundo= Integer.parseInt(teclado.nextLine());
        Caja caja1= new Caja(medidaAncho, medidaAlto, medidaProfundo);
        resultado = caja1.volumenCaja();
        System.out.println("Volumen de la Caja1: " + resultado);
    }
}

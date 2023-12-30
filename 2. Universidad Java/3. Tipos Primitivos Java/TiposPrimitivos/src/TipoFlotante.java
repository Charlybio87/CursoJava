public class TipoFlotante {
    public static void main(String[] args) {
        /*
            tipos primitivos de tipo flotante: float o double.
        */

        float numeroFloat = (float) 10.0;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor Minimo: " + Float.MIN_VALUE);
        System.out.println("Valor Maximo: " + Float.MAX_VALUE);

        float numeroFloat2 = (float) 3.4028235E38D;
        System.out.println("numeroFloat2 = " + numeroFloat2);

        double numeroDouble = 10;
        System.out.println("numerodouble = " + numeroDouble);
        System.out.println("Valor Minimo: " + Double.MIN_VALUE);
        System.out.println("Valor Maximo: " + Double.MAX_VALUE);

        double numeroDouble2 = 1.7976931348623157E308;
        System.out.println("numerodouble = " + numeroDouble2);
    }
}

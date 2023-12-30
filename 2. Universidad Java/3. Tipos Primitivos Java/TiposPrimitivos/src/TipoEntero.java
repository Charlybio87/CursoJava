public class TipoEntero {
    public static void main(String[] args) {
         /*
            tipos primitivos enteros: byte, short, int, long
         */

        int numeroByte = (byte) 129;
        System.out.println("Valor de numerobyte = " + numeroByte);
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);

        short numeroShort = 10000;
        System.out.println("Valor de numeroshort = " + numeroShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);

        int numeroInt = (int)2147483648L;
        System.out.println("Valor de numeroInt = " + numeroInt);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);

        //long numeroLong =(long)9223372036854775808F;//9223372036854775808D (double)
        long numeroLong = 9223372036854775807L;
        System.out.println("Valor de numeroLong = " + numeroLong);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);

    }
}

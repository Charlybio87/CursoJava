package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        //Variables locales
        var a = 10;
        var b = 2;
        miMetodo();
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2 a: " + aritmetica2.a);
        System.out.println("aritmetica2 b: " + aritmetica2.b);
        //aritmetica1 = null;
        //System.gc();
    }
    public static void miMetodo(){
        //fuera de alcance de la variable de donde se definio
        //a = 10;
        System.out.println("Otro metodo");
    }

}

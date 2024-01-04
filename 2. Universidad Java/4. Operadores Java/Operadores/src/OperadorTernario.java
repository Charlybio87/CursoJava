public class OperadorTernario {
    public static void main(String[] args) {
        var resultado = (3 > 2) ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado);

        resultado = (1 > 2) ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado);

        var numero = 8;
        var resultado2 = (numero % 2 == 0) ? "Es Par":"No es Par";
        System.out.println("resultado2 = " + resultado2);

        numero = 11;
        resultado2 = (numero % 2 == 0) ? "Es Par":"No es Par";
        System.out.println("resultado2 = " + resultado2);
    }
}

public class CicloEtiqueta {
    public static void main(String[] args) {
        rompo:
        for (var contador = 0; contador < 3; contador++) {
            for (int i = 0; i <5 ; i++) {
                System.out.println("i = " + i);
                if (contador % 2 != 0) {
                    System.out.println("contador = " + contador);
                    break rompo;
                }
            }
        }
        inicio:
        for (var contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0) {
                continue inicio;
            }
            System.out.println("contador = " + contador);
        }
    }
}

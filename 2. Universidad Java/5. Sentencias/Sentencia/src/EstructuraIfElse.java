public class EstructuraIfElse {
    public static void main(String[] args) {
        var condicion = true;

        if(condicion){
            System.out.println("condicion verdadera");
        } else {
            System.out.println("condicion falsa");
        }

        var numero = 2;
        var numeroTexto = "Numero desconcido";

        if (numero == 1){
            System.out.println("numero 1");
        } else if (numero == 2) {
            System.out.println("numero 2");
        } else if (numero == 3) {
            System.out.println("numero 3");
        } else if (numero == 4) {
            System.out.println("numero 4");
        } else{
            System.out.println("numeroTexto = " + numeroTexto);
        }
    }

}

public class OperadorCondicional {
    public static void main(String[] args) {
        var a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;

        var resultado = a >= valorMinimo && a <= valorMaximo;
        System.out.println("resultado = " + resultado);
        if (resultado){
            System.out.println("dentro de rango");
        } else{
            System.out.println("fuera de rango");
        }
        var vacaiones = false;
        var diaDescanso = false;

        if (vacaiones || diaDescanso){
            System.out.println("padre puede asistir.");
        } else{
            System.out.println("padre no puede asistir.");
        }


    }
}

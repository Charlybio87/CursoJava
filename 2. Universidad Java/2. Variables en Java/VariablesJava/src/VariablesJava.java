public class VariablesJava {
    public static void main(String[] args) {
        //Definimos la variables
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);

        //var - Inferencia de tipos en Java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        var miVariableCadena2 = "Nueva Cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2); //soutv

        //Valores permitidos en el nombre de variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        var miVariable2 = "Yo soy tui Jefe";

        //Lista de palabras clave de Java
        //https://en.wikipedia.org/wiki/List_of_Java_keywords

    }
}

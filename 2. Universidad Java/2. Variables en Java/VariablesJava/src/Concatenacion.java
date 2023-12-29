public class Concatenacion {
    public static void main(String[] args) {
        var usuario = "Charly";
        var titulo = "Bioingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        //Suma de numeros
        var i = 3;
        var j = 4;
        System.out.println(i + j);
        System.out.println(i + j + usuario);//evaluacion de izq a der suma
        System.out.println(usuario + i + j);//de izq a der contexto cadena
        System.out.println(usuario + (i + j));//uso de parentesis modifica la prioridad
    }
}

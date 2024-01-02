public class OperadorUnario {
    public static void main(String[] args) {
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        var c = true;
        var d = !c;
        System.out.println("d = " + d);

        //Incremento
        //1. preincremento
        var e = 3;
        var f = ++e;//primero se incrementa la variable y luego se usa su valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        //2. postincremento
        var g = 5;
        var h = g++;//primero se utiliza el valor y despues se incrementa
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        //decremento
        //1. predecremento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        //2. postdecremento
        var k = 4;
        var l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);


    }
}

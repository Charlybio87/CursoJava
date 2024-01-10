package laboratorio;

public class Caja {
    int ancho;
    int alto;
    int profundo;
    public Caja(){
        System.out.println("Proyecto de Laboratorio\n");
        System.out.println("Formula de volumen: " + "vol = ancho x alto x profundo");
    }
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int volumenCaja(){
        System.out.print("Calculando...\n");
        return ancho * alto  * profundo ;
    }

}
